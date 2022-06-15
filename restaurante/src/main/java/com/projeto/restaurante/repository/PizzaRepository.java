package com.projeto.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.restaurante.model.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
	
	
}
