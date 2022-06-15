package com.projeto.restaurante.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pizza {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String sabor;
	
	private String tamanho;
	
	private double preco;

	public Pizza(String sabor, String tamanho, double preco) {
		super();
		this.sabor = sabor;
		this.tamanho = tamanho;
		this.preco = preco;
	}
	
	public Pizza() {
		super();	
		}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Pizza [id=" + id + ", sabor=" + sabor + ", tamanho=" + tamanho + ", preco=" + preco + "]";
	}
	
	
	
	

}
