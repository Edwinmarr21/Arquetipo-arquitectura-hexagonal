package com.arquitecturahexagonal.arquetipo.infrastructure.configuration;

import com.arquitecturahexagonal.arquetipo.domain.api.ExampleHandler;
import com.arquitecturahexagonal.arquetipo.domain.api.ExampleHandlerImpl;
import com.arquitecturahexagonal.arquetipo.domain.ports.PersistencePort;
import com.arquitecturahexagonal.arquetipo.domain.usecases.ExampleUseCase;
import com.arquitecturahexagonal.arquetipo.domain.usecases.ExampleUseCaseImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This class is meant to define the needed beans for dependency injections.
 *
 * 1) Define a method with @Bean annotation.
 * 2) Define the return type of the method the interface of the port.
 * 3) Return an instance of an implementation of that interface.
 */
@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final PersistencePort persistencePort;
    @Bean
    public ExampleUseCase exampleUseCase(){
        return new ExampleUseCaseImpl(persistencePort);
    }
    @Bean
    public ExampleHandler exampleHandler(){
        return new ExampleHandlerImpl(exampleUseCase());
    }
}
