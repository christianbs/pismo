package br.com.pismo.framework.transaction.inbound.converter;

import br.com.pismo.application.transaction.core.Transaction;
import br.com.pismo.framework.configuration.MapStructConfiguration;
import br.com.pismo.framework.transaction.inbound.record.TransactionRecord;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MapStructConfiguration.class)
public interface TransactionRecordToTransactionConverter extends Converter<TransactionRecord, Transaction> {

}
