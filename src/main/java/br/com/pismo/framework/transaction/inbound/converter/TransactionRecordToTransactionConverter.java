package br.com.pismo.framework.transaction.inbound.converter;

import br.com.pismo.application.transaction.core.Transaction;
import br.com.pismo.framework.configuration.MapStructConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MapStructConfiguration.class)
public interface TransactionRecordToTransactionConverter extends Converter<TransactionConverterContext, Transaction> {

    @Override
    @Mapping(source = "account", target = "account")
    @Mapping(source = "operationType", target = "operationType")
    @Mapping(source = "transactionRecord.amount", target = "amount")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "eventDate", ignore = true)
    Transaction convert(TransactionConverterContext source);
}
