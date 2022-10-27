package br.com.pismo.application.account.ports.out;

import br.com.pismo.application.account.core.Account;

public interface CreateAccountPort {
    Account create(Account account);
}
