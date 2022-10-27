package br.com.pismo.framework.account.configuration;

import br.com.pismo.application.account.core.CreateAccountUseCase;
import br.com.pismo.application.account.ports.in.CreateAccountUseCasePort;
import br.com.pismo.application.account.ports.out.CreateAccountPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountPortsConfiguration {

    @Bean
    public CreateAccountUseCasePort createAccountPortProducer(CreateAccountPort createAccountPort) {
        return new CreateAccountUseCase(createAccountPort);
    }

}
