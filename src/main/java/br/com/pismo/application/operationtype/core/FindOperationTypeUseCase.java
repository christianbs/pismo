package br.com.pismo.application.operationtype.core;

import br.com.pismo.application.operationtype.ports.in.FindOperationTypeUseCasePort;
import br.com.pismo.application.operationtype.ports.out.FindOperationTypePort;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class FindOperationTypeUseCase implements FindOperationTypeUseCasePort {

    private final FindOperationTypePort port;

    @Override
    public Optional<OperationType> findById(int id) {
        return port.findById(id);
    }

}
