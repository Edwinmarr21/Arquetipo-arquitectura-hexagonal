package com.arquitecturahexagonal.arquetipo.adapters.drivenadapters.postgresdbadapter.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@Builder
@Entity
@Table(name = "example")
public class ExampleEntity {

    @Id
    @Column(name = "id")
    private String exampleField;
    @Column(name = "id")
    private String exampleField2;
    @Column(name = "id")
    private String exampleField3;
    @Column(name = "id")
    private String exampleField4;

}
