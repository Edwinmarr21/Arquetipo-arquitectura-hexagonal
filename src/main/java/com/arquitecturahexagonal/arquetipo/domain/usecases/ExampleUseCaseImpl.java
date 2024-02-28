package com.arquitecturahexagonal.arquetipo.domain.usecases;

import com.arquitecturahexagonal.arquetipo.domain.model.entities.Example;
import com.arquitecturahexagonal.arquetipo.domain.ports.PersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ExampleUseCaseImpl implements ExampleUseCase{

    private final PersistencePort persistencePort;

    @Override
    public void saveExample(Example example){
        persistencePort.saveExample(example);
    }

    @Override
    public Example getExampleById(String id) {
        return persistencePort.getExampleById(id);
    }
}
