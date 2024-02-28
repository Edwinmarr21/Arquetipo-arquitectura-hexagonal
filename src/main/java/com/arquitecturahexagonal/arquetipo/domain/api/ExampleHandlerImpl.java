package com.arquitecturahexagonal.arquetipo.domain.api;

import com.arquitecturahexagonal.arquetipo.domain.model.dto.ExampleDto;
import com.arquitecturahexagonal.arquetipo.domain.model.entities.Example;
import com.arquitecturahexagonal.arquetipo.domain.usecases.ExampleUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ExampleHandlerImpl implements ExampleHandler {

    private final ExampleUseCase exampleUseCase;

    @Override
    public void saveExample(Example example) {
        exampleUseCase.saveExample(example);
    }

    @Override
    public Example getExampleById(String id) {
        return exampleUseCase.getExampleById(id);
    }

    @Override
    public ExampleDto getExampleDtoById(String id) {
        Example example = exampleUseCase.getExampleById(id);
        return ExampleDto.builder()
                .studentName(example.getExampleField())
                .cellPhone(example.getExampleField2())
                .finalGrade(0).build();
    }
}
