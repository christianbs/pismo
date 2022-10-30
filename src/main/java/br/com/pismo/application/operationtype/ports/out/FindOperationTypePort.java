package br.com.pismo.application.operationtype.ports.out;

import br.com.pismo.application.operationtype.core.OperationType;

import java.util.Optional;

public interface FindOperationTypePort {

    Optional<OperationType> findById(int id);

}
