package com.arquitecturahexagonal.arquetipo.adapters.drivenadapters.postgresdbadapter.config;

import com.arquitecturahexagonal.arquetipo.adapters.drivenadapters.postgresdbadapter.repository.ExampleDbRepository;
import com.arquitecturahexagonal.arquetipo.adapters.drivenadapters.postgresdbadapter.service.ExampleService;
import com.arquitecturahexagonal.arquetipo.domain.ports.PersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.arquitecturahexagonal.arquetipo.adapters.drivenadapters.postgresdbadapter.repository")
@EntityScan(basePackages = "com.arquitecturahexagonal.arquetipo.adapters.drivenadapters.postgresdbadapter.entities")
@RequiredArgsConstructor
public class DbConfig {

    private final ExampleDbRepository exampleDbRepository;
    @Bean
    public PersistencePort persistencePort(){
        return new ExampleService(exampleDbRepository);
    }

}
