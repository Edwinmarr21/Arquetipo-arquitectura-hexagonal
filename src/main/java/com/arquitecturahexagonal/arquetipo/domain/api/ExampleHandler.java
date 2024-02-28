package com.arquitecturahexagonal.arquetipo.domain.api;

import com.arquitecturahexagonal.arquetipo.domain.model.dto.ExampleDto;
import com.arquitecturahexagonal.arquetipo.domain.model.entities.Example;

public interface ExampleHandler {

    void saveExample(Example example);
    Example getExampleById(String id);

    ExampleDto getExampleDtoById(String id);
}
