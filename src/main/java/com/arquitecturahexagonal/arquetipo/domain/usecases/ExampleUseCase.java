package com.arquitecturahexagonal.arquetipo.domain.usecases;

import com.arquitecturahexagonal.arquetipo.domain.model.entities.Example;

public interface ExampleUseCase {
    void saveExample(Example example);
    Example getExampleById(String id);
}
