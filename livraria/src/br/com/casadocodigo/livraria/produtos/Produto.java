package br.com.casadocodigo.livraria.produtos;

public interface Produto {
	
	/*
	 * Interfaces estabelecem um contrato com cláusulas (métodos abstratos) que todas as classes em implementam essa
	 * interface deve seguir. Ou seja, estabelece comportamentos comuns. 
	 * 
	 * Diferente de uma classe abstrata uma interface não pode possuir atributos.
	 * 
	 * Interfaces podem ser implementadas inclusive em clases abstratas.
	 * 
	 * */

	
	/*
	 * todo método sem compor é abstrato. Logo a declaração da palavra reservada 'abstract' é opcional.
	 * O mesmo vale para o modificador de acesso públic que é assim por padrão.
	 * */
	public abstract double getValor();
	
	
}
