package br.com.pismo.framework.operationtype.inbound.configuration;

import br.com.pismo.application.operationtype.core.FindOperationTypeUseCase;
import br.com.pismo.application.operationtype.ports.in.FindOperationTypeUseCasePort;
import br.com.pismo.application.operationtype.ports.out.FindOperationTypePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OperationTypePortsConfiguration {

    @Bean
    public FindOperationTypeUseCasePort findOperationTypeUseCasePortProducer(FindOperationTypePort findOperationTypePort) {
        return new FindOperationTypeUseCase(findOperationTypePort);
    }

}
