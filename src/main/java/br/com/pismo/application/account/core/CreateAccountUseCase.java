package br.com.pismo.application.account.core;

import br.com.pismo.application.account.ports.in.CreateAccountUseCasePort;
import br.com.pismo.application.account.ports.out.CreateAccountPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateAccountUseCase implements CreateAccountUseCasePort {

    private final CreateAccountPort port;

    @Override
    public Account createAccount(Account toCreate) {
        return port.create(toCreate);
    }

}
