package br.com.pismo.application.account.ports.out;

import br.com.pismo.application.account.core.Account;

import java.util.Optional;

public interface FindAccountPort {

    Optional<Account> findById(int id);

}
