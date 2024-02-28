package com.arquitecturahexagonal.arquetipo.infrastructure.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.arquitecturahexagonal.arquetipo")
public class ArquetipoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArquetipoApplication.class, args);
	}

}
