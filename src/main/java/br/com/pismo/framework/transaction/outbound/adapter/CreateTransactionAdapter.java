package br.com.pismo.framework.transaction.outbound.adapter;

import br.com.pismo.application.transaction.core.Transaction;
import br.com.pismo.application.transaction.ports.out.CreateTransactionPort;
import br.com.pismo.framework.transaction.outbound.entity.TransactionEntity;
import br.com.pismo.framework.transaction.outbound.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateTransactionAdapter implements CreateTransactionPort {

    private final TransactionRepository repository;
    private final ConversionService conversionService;

    @Override
    public Transaction createTransaction(final Transaction transaction) {
        final TransactionEntity toCreate = conversionService.convert(transaction, TransactionEntity.class);
        final TransactionEntity created = repository.save(toCreate);
        return conversionService.convert(created, Transaction.class);
    }

}
