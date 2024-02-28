package com.arquitecturahexagonal.arquetipo.domain.model.entities;


import com.arquitecturahexagonal.arquetipo.domain.model.enums.SeniotityExample;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Example {
    private String exampleField;
    private String exampleField2;
    private String exampleField3;
    private String exampleField4;
    private SeniotityExample exampleField5;
}
