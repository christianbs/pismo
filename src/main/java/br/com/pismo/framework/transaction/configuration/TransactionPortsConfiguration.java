package br.com.pismo.framework.transaction.configuration;

import br.com.pismo.application.transaction.core.CreateTransactionUseCase;
import br.com.pismo.application.transaction.ports.in.CreateTransactionUseCasePort;
import br.com.pismo.application.transaction.ports.out.CreateTransactionPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TransactionPortsConfiguration {

    @Bean
    public CreateTransactionUseCasePort createTransactionUseCasePortProducer(final CreateTransactionPort createTransactionPort) {
        return new CreateTransactionUseCase(createTransactionPort);
    }

}
