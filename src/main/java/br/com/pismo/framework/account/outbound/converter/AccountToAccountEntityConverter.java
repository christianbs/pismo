package br.com.pismo.framework.account.outbound.converter;

import br.com.pismo.application.account.core.Account;
import br.com.pismo.configuration.MapStructConfiguration;
import br.com.pismo.framework.account.outbound.entity.AccountEntity;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MapStructConfiguration.class)
public interface AccountToAccountEntityConverter extends Converter<Account, AccountEntity> {
}
