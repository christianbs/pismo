package br.com.pismo.application.transaction.core;

import br.com.pismo.application.transaction.ports.in.CreateTransactionUseCasePort;
import br.com.pismo.application.transaction.ports.out.CreateTransactionPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateTransactionUseCase implements CreateTransactionUseCasePort {

    private final CreateTransactionPort createTransactionPort;

    @Override
    public Transaction createTransaction(final Transaction toCreate) {
        toCreate.create();
        return createTransactionPort.createTransaction(toCreate);
    }

}
