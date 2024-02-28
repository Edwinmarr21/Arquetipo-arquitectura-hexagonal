package com.arquitecturahexagonal.arquetipo.domain.model.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ExampleDto {
    private String studentName;
    private String cellPhone;
    private float finalGrade;

}
