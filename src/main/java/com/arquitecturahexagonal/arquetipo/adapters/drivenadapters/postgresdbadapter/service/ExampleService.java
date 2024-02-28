package com.arquitecturahexagonal.arquetipo.adapters.drivenadapters.postgresdbadapter.service;

import com.arquitecturahexagonal.arquetipo.adapters.drivenadapters.postgresdbadapter.entities.ExampleEntity;
import com.arquitecturahexagonal.arquetipo.adapters.drivenadapters.postgresdbadapter.mapper.Mapper;
import com.arquitecturahexagonal.arquetipo.adapters.drivenadapters.postgresdbadapter.repository.ExampleDbRepository;
import com.arquitecturahexagonal.arquetipo.domain.model.entities.Example;
import com.arquitecturahexagonal.arquetipo.domain.ports.PersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ExampleService implements PersistencePort {

    private final ExampleDbRepository exampleDbRepository;
    @Override
    public Example getExampleById(String id){
        return Mapper.mapToExample(exampleDbRepository.findById(id).orElse(ExampleEntity.builder().build()));
    }
    @Override
    public void saveExample(Example example){
        exampleDbRepository.save(Mapper.mapToExampleEntity(example));
    }

}
