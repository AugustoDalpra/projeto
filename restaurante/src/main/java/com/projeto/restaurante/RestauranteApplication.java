package com.projeto.restaurante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan(basePackages = "com.projeto.restaurante.model")
@SpringBootApplication
public class RestauranteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestauranteApplication.class, args);
	}

}
