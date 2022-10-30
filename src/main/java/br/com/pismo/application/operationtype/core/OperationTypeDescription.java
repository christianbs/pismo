package br.com.pismo.application.operationtype.core;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OperationTypeDescription {

    SAQUE("SAQUE"),
    PAGAMENTO("PAGAMENTO"),
    COMPRA_A_VISTA("COMPRA A VISTA"),
    COMPRA_PARCELADA("COMPRA PARCELADA");

    private final String value;

}
