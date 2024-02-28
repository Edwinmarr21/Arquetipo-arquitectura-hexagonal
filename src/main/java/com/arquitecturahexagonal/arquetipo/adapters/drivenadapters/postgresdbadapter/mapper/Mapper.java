package com.arquitecturahexagonal.arquetipo.adapters.drivenadapters.postgresdbadapter.mapper;

import com.arquitecturahexagonal.arquetipo.adapters.drivenadapters.postgresdbadapter.entities.ExampleEntity;
import com.arquitecturahexagonal.arquetipo.domain.model.entities.Example;

public class Mapper {
    public static Example mapToExample(ExampleEntity example){
        return Example.builder()
                .exampleField(example.getExampleField())
                .exampleField2(example.getExampleField2())
                .exampleField3(example.getExampleField3())
                .exampleField4(example.getExampleField4())
                .build();
    }

    public static ExampleEntity mapToExampleEntity(Example example) {
        return ExampleEntity.builder()
                .exampleField(example.getExampleField())
                .exampleField2(example.getExampleField2())
                .exampleField3(example.getExampleField3())
                .exampleField4(example.getExampleField4())
                .build();
    }
}
