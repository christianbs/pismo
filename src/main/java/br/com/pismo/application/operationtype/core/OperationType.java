package br.com.pismo.application.operationtype.core;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class OperationType {
    private final int id;
    private final OperationTypeDescription description;
}
