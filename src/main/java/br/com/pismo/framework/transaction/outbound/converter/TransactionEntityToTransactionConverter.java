package br.com.pismo.framework.transaction.outbound.converter;

import br.com.pismo.application.transaction.core.Transaction;
import br.com.pismo.framework.configuration.MapStructConfiguration;
import br.com.pismo.framework.transaction.outbound.entity.TransactionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MapStructConfiguration.class)
public interface TransactionEntityToTransactionConverter extends Converter<TransactionEntity, Transaction> {

    @Override
    @Mapping(source = "account.id", target = "accountId")
    @Mapping(source = "operationType.id", target = "operationTypeId")
    Transaction convert(TransactionEntity source);

}
