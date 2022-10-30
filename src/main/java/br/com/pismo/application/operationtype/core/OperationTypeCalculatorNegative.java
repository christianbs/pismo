package br.com.pismo.application.operationtype.core;

import java.math.BigDecimal;

public class OperationTypeCalculatorNegative implements OperationTypeCalculator {

    @Override
    public BigDecimal calculate(BigDecimal initialValue) {
        return initialValue.multiply(BigDecimal.valueOf(-1));
    }

    @Override
    public boolean isApplicable(OperationType operationType) {
        boolean isCompraParcelada = OperationTypeDescription.COMPRA_PARCELADA.equals(operationType.getDescription());
        boolean isCompraAVista = OperationTypeDescription.COMPRA_A_VISTA.equals(operationType.getDescription());
        boolean isSaque = OperationTypeDescription.SAQUE.equals(operationType.getDescription());
        return isCompraParcelada || isCompraAVista || isSaque;
    }

}
