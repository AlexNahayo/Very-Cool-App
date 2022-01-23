package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
//Where the spring application is run
public class VeryCoolAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeryCoolAppApplication.class, args);
	}

}
