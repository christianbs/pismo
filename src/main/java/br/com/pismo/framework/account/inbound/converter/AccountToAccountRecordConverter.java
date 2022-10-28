package br.com.pismo.framework.account.inbound.converter;

import br.com.pismo.application.account.core.Account;
import br.com.pismo.framework.account.inbound.record.AccountRecord;
import br.com.pismo.framework.configuration.MapStructConfiguration;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MapStructConfiguration.class)
public interface AccountToAccountRecordConverter extends Converter<Account, AccountRecord> {

}
