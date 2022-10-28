package br.com.pismo.application.account.ports.in;

import br.com.pismo.application.account.core.Account;

import java.util.Optional;

public interface FindAccountUseCasePort {

    Optional<Account> findById(int id);

}
