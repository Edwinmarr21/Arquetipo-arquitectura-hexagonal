package com.arquitecturahexagonal.arquetipo.domain.ports;

import com.arquitecturahexagonal.arquetipo.domain.model.entities.Example;

public interface PersistencePort {
    Example getExampleById(String id);
    void saveExample(Example example);
}
