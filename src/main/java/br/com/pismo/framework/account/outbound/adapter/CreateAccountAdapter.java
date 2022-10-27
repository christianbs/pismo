package br.com.pismo.framework.account.outbound.adapter;

import br.com.pismo.application.account.core.Account;
import br.com.pismo.application.account.ports.out.CreateAccountPort;
import br.com.pismo.framework.account.outbound.entity.AccountEntity;
import br.com.pismo.framework.account.outbound.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateAccountAdapter implements CreateAccountPort {

    private final AccountRepository repository;
    private final ConversionService conversionService;

    @Override
    public Account create(Account account) {
        final AccountEntity toCreate = conversionService.convert(account, AccountEntity.class);
        final AccountEntity created = repository.save(toCreate);
        return conversionService.convert(created, Account.class);
    }

}
