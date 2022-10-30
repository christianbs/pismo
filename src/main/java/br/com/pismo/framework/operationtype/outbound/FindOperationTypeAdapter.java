package br.com.pismo.framework.operationtype.outbound;

import br.com.pismo.application.operationtype.core.OperationType;
import br.com.pismo.application.operationtype.ports.out.FindOperationTypePort;
import br.com.pismo.framework.operationtype.outbound.repository.OperationTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class FindOperationTypeAdapter implements FindOperationTypePort {

    private final OperationTypeRepository repository;

    private final ConversionService conversionService;

    @Override
    public Optional<OperationType> findById(int id) {
        return repository.findById(id)
                .map((entity) -> conversionService.convert(entity, OperationType.class))
                .or(Optional::empty);
    }

}
