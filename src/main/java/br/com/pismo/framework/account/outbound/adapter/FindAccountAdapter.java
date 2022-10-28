package br.com.pismo.framework.account.outbound.adapter;

import br.com.pismo.application.account.core.Account;
import br.com.pismo.application.account.ports.out.FindAccountPort;
import br.com.pismo.framework.account.outbound.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class FindAccountAdapter implements FindAccountPort {

    private final AccountRepository repository;

    private final ConversionService conversionService;

    @Override
    public Optional<Account> findById(int id) {
        return repository.findById(id)
                .map((entity) -> conversionService.convert(entity, Account.class))
                .or(Optional::empty);
    }

}
