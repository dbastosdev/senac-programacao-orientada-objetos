package br.com.casadocodigo.livraria.helpers;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeCupons {
	
	// Atributos
	private Map<String, Double> cupons;
	
	// Construtor com valores de cupons de descontos válidos
	public GerenciadorDeCupons() {
		// .asList é um Factory que popula cupons
		this.cupons = new HashMap<>();
		cupons.put("CUP74", 10.0);
		cupons.put("CUP22", 12.0);
		cupons.put("CUP33", 13.0);
		cupons.put("CUP44", 14.0);
	}
	
	public Double validaCupom(String cupom) {
		return this.cupons.get(cupom);
	}

}
