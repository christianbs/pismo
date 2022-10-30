package br.com.pismo.application.operationtype.core;

import java.util.List;

public class OperationTypeCalculatorFactory {

    private final List<OperationTypeCalculator> calculators;

    public OperationTypeCalculatorFactory() {
        calculators = List.of(new OperationTypeCalculatorPositive(), new OperationTypeCalculatorNegative());
    }

    public OperationTypeCalculator getInstance(final OperationType operationType) {
        return calculators.stream()
                .filter((calculator) -> calculator.isApplicable(operationType))
                .findFirst()
                .orElseThrow();
    }
}
