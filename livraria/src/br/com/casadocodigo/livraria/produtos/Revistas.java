package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Editora;

/*
 * Para pensar. Uma revista não é um livro. Como fica o carrinho de compras? 
 * */

public class Revistas implements Produto, Promocional {
	
	// Atributos
	
	private String nome;
	private String descricao;
	private double valor;
	private Editora editora;
	
	// getters e setters
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
	// métodos
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		// reescrevendo o método uma vez que o padrão é não ter desconto. 
		if(porcentagem > 0.3) {
			return false;
		}
		
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		System.out.println("aplicando desconto no Livro Físico");
		return true;
	}
	

}
