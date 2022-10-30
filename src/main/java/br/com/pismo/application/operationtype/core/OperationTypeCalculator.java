package br.com.pismo.application.operationtype.core;

import java.math.BigDecimal;

public interface OperationTypeCalculator {

    BigDecimal calculate(BigDecimal initialValue);

    boolean isApplicable(OperationType operationType);

}
