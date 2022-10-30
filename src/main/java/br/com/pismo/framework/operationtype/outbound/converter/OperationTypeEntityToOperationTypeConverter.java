package br.com.pismo.framework.operationtype.outbound.converter;

import br.com.pismo.application.operationtype.core.OperationType;
import br.com.pismo.framework.configuration.MapStructConfiguration;
import br.com.pismo.framework.operationtype.outbound.entity.OperationTypeEntity;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MapStructConfiguration.class)
public interface OperationTypeEntityToOperationTypeConverter extends Converter<OperationTypeEntity, OperationType> {

}
