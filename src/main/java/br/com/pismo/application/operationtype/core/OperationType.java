package br.com.pismo.application.operationtype.core;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Getter
@RequiredArgsConstructor
public class OperationType {
    private final int id;
    private final OperationTypeDescription description;

    public BigDecimal calculate(final BigDecimal amount) {
        final OperationTypeCalculatorFactory factory = new OperationTypeCalculatorFactory();
        final OperationTypeCalculator calculator = factory.getInstance(this);
        return calculator.calculate(amount);

//        if (!OperationTypeDescription.PAGAMENTO.equals(description)) {
//            return amount.multiply(BigDecimal.valueOf(-1));
//        }
    }

}
