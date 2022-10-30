package br.com.pismo.application.transaction.core;

import br.com.pismo.application.account.core.Account;
import br.com.pismo.application.operationtype.core.OperationType;
import br.com.pismo.application.operationtype.core.OperationTypeCalculator;
import br.com.pismo.application.operationtype.core.OperationTypeCalculatorFactory;
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
        final OperationTypeCalculatorFactory factory = new OperationTypeCalculatorFactory();
        final OperationTypeCalculator calculator = factory.getInstance(operationType);
        amount = calculator.calculate(amount);
    }

}
