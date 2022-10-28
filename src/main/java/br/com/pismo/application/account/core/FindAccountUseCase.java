package br.com.pismo.application.account.core;

import br.com.pismo.application.account.ports.in.FindAccountUseCasePort;
import br.com.pismo.application.account.ports.out.FindAccountPort;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class FindAccountUseCase implements FindAccountUseCasePort {

    private final FindAccountPort port;

    @Override
    public Optional<Account> findById(int id) {
        return port.findById(id);
    }

}
