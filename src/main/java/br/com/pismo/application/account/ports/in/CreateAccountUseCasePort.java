package br.com.pismo.application.account.ports.in;

import br.com.pismo.application.account.core.Account;

public interface CreateAccountUseCasePort {
    Account createAccount(Account toCreate);
}
