package br.com.pismo.application.operationtype.ports.in;

import br.com.pismo.application.operationtype.core.OperationType;

import java.util.Optional;

public interface FindOperationTypeUseCasePort {

    Optional<OperationType> findById(int id);

}
