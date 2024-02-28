package com.arquitecturahexagonal.arquetipo.domain.model.enums;

public enum SeniotityExample {

    TRAINEE("Trainee"),
    JUNIOR("Junior"),
    ADVANCED("Advanced"),
    SENIOR("Senior"),
    MASTER("Master");

    private String seniorityName;

    SeniotityExample(String seniorityName) {
        this.seniorityName = seniorityName;
    }

    public String getSeniorityName() {
        return seniorityName;
    }
}
