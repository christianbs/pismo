package br.com.pismo.framework.transaction.inbound.controller;

import br.com.pismo.application.account.core.Account;
import br.com.pismo.application.account.ports.in.FindAccountUseCasePort;
import br.com.pismo.application.operationtype.core.OperationType;
import br.com.pismo.application.operationtype.ports.in.FindOperationTypeUseCasePort;
import br.com.pismo.application.transaction.core.Transaction;
import br.com.pismo.application.transaction.ports.in.CreateTransactionUseCasePort;
import br.com.pismo.framework.transaction.inbound.converter.TransactionConverterContext;
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

    private final FindOperationTypeUseCasePort findOperationTypePort;

    private final FindAccountUseCasePort findAccountPort;

    private final ConversionService conversionService;

    @PostMapping
    public ResponseEntity<TransactionRecord> post(@RequestBody @Valid final TransactionRecord record) {
        final Account account = findAccountPort.findById(record.accountId()).orElseThrow();
        final OperationType operationType = findOperationTypePort.findById(record.operationTypeId()).orElseThrow();
        final TransactionConverterContext converterContext = new TransactionConverterContext(account, operationType, record);
        final Transaction toCreate = conversionService.convert(converterContext, Transaction.class);
        final Transaction created = createTransactionPort.createTransaction(toCreate);
        final TransactionRecord toReturn = conversionService.convert(created, TransactionRecord.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(toReturn);
    }

}
