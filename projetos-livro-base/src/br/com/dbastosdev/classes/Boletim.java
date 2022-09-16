package br.com.dbastosdev.classes;

public class Boletim {
	
	// Atributos
	public float nota;
	public int frequencia;
	public String status;
	
	
	// Metodos
	public void inserir_nota() {
		
	}
	
	public void excluir_nota() {
		
	}
	
	public void alterar_nota() {
		
	}
	
	public void inserir_frequencia() {
		
	}
	
	public void alterar_status() {
		
	}
	
	/*
	 * Usando polimorfismo estático (sobrecarga) para o cálculo de média
	 * 
	 * GRADUAÇÃO:
	 * 
	 * AM = Avaliação Multidisciplinar (e vale 30% da média)
	 * AC = Avaliação Continuada (e vale 20% da média)
	 * AS = Avaliação Semestral (e vale 50% da média)
	   MS = Média Semestral
	   
	   PÓS-GRADUAÇÃO:
	   
	   PM = Projeto Multidisciplinar (e vale 40% da média)
	   AS = Avaliação Semestral (e vale 60% da média)
	   MM = Média Modular
	   
     */
	
	// Cálculo da graduação
	public double calcular_media(double AM, double AC, double AS) {
		return  (AM * 0.3) + (0.2 * AC) + (0.5 * AS); 
	}
	
	// Cálculo da graduação
	public double calcular_media(double PM, double AS) {
		return (PM * 0.4) + (AS * 0.6); 
	}



}
