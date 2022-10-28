package br.com.pismo.framework.transaction.outbound.converter;

import br.com.pismo.application.transaction.core.Transaction;
import br.com.pismo.framework.configuration.MapStructConfiguration;
import br.com.pismo.framework.transaction.outbound.entity.TransactionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MapStructConfiguration.class)
public interface TransactionToTransactionEntityConverter extends Converter<Transaction, TransactionEntity> {

    @Override
    @Mapping(source = "accountId", target = "account.id")
    @Mapping(source = "operationTypeId", target = "operationType.id")
    TransactionEntity convert(Transaction source);

}
