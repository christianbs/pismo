package br.com.pismo.framework.transaction.inbound.controller;

import br.com.pismo.application.transaction.core.Transaction;
import br.com.pismo.application.transaction.ports.in.CreateTransactionUseCasePort;
import br.com.pismo.framework.transaction.inbound.record.TransactionRecord;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
@RequestMapping("/transaction")
@RequiredArgsConstructor
public class TransactionController {

    private final CreateTransactionUseCasePort createTransactionPort;

    private final ConversionService conversionService;

    @PostMapping
    public ResponseEntity<TransactionRecord> post(@RequestBody @Valid final TransactionRecord record) {
        final Transaction transaction = conversionService.convert(record, Transaction.class);
        final Transaction created = createTransactionPort.createTransaction(transaction);
        final TransactionRecord toReturn = conversionService.convert(created, TransactionRecord.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(toReturn);
    }

}
