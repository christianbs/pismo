package br.com.pismo.framework.account.configuration;

import br.com.pismo.application.account.core.CreateAccountUseCase;
import br.com.pismo.application.account.core.FindAccountUseCase;
import br.com.pismo.application.account.ports.in.CreateAccountUseCasePort;
import br.com.pismo.application.account.ports.in.FindAccountUseCasePort;
import br.com.pismo.application.account.ports.out.CreateAccountPort;
import br.com.pismo.application.account.ports.out.FindAccountPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountPortsConfiguration {

    @Bean
    public CreateAccountUseCasePort createAccountPortProducer(CreateAccountPort createAccountPort) {
        return new CreateAccountUseCase(createAccountPort);
    }

    @Bean
    public FindAccountUseCasePort findAccountPortProducer(FindAccountPort findAccountPort) {
        return new FindAccountUseCase(findAccountPort);
    }

}
