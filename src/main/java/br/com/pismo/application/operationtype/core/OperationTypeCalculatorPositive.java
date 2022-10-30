package br.com.pismo.application.operationtype.core;

import java.math.BigDecimal;

public class OperationTypeCalculatorPositive implements OperationTypeCalculator {

    @Override
    public BigDecimal calculate(BigDecimal initialValue) {
        return initialValue;
    }

    @Override
    public boolean isApplicable(OperationType operationType) {
        return OperationTypeDescription.PAGAMENTO.equals(operationType.getDescription());
    }

}
