package br.com.pismo.framework.operationtype.outbound.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OperationTypeDescription {

    SAQUE("SAQUE"),
    PAGAMENTO("PAGAMENTO"),
    COMPRA_A_VISTA("COMPRA A VISTA"),
    COMPRA_PARCELADA("COMPRA PARCELADA");

    private final String description;

}
