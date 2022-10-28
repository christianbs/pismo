package br.com.pismo.application.transaction.ports.out;

import br.com.pismo.application.transaction.core.Transaction;

public interface CreateTransactionPort {

    Transaction createTransaction(Transaction transaction);

}
