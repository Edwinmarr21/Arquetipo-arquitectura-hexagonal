package com.arquitecturahexagonal.arquetipo.adapters.drivenadapters.postgresdbadapter.repository;

import com.arquitecturahexagonal.arquetipo.adapters.drivenadapters.postgresdbadapter.entities.ExampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleDbRepository extends JpaRepository<ExampleEntity, String> {
}
