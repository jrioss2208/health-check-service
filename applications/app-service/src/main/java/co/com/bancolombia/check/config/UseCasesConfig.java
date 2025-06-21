package co.com.bancolombia.check.config;

import co.com.bancolombia.check.usecase.CheckSystemHealthUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCasesConfig {

    @Bean
    public CheckSystemHealthUseCase checkSystemHealthUseCase() {
        return new CheckSystemHealthUseCase();
    }
}
