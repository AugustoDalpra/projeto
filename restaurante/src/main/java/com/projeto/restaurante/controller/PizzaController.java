package com.projeto.restaurante.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.restaurante.model.Pizza;
import com.projeto.restaurante.repository.PizzaRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/pizzas")
public class PizzaController {

	@Autowired
	private PizzaRepository pizzaRepository;
	
	
	
	@GetMapping("/listar")
	public List<Pizza> listar() {
	
		List<Pizza> lista = new ArrayList<>();
		lista = pizzaRepository.findAll();
		
		return lista;
	}
	

	
	@PostMapping("/cadastrar")
	public Pizza salvarPizza(@RequestBody Pizza pizza) {
		
		Pizza pizzaNova = pizzaRepository.save(pizza);
		return pizzaNova;
	}
	
	
	
	
	
}
