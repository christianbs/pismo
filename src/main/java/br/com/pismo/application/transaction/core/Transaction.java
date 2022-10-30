package br.com.pismo.application.transaction.core;

import br.com.pismo.application.account.core.Account;
import br.com.pismo.application.operationtype.core.OperationType;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@AllArgsConstructor
public class Transaction {

    private int id;

    private Account account;

    private OperationType operationType;

    private BigDecimal amount;

    private Instant eventDate;

    void create() {
        eventDate = Instant.now();
        amount = operationType.calculate(amount);
    }

}
