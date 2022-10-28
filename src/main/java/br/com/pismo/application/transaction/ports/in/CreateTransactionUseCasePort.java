package br.com.pismo.application.transaction.ports.in;

import br.com.pismo.application.transaction.core.Transaction;

public interface CreateTransactionUseCasePort {

    Transaction createTransaction(Transaction toCreate);

}
