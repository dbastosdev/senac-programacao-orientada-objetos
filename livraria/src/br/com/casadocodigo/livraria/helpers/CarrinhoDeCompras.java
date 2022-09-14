package br.com.casadocodigo.livraria.helpers;

import java.util.ArrayList;
import java.util.List;

import br.com.casadocodigo.livraria.produtos.Produto;

// Carrinho de compras é uma classe utilizada para adicionar livros, sejam físicos ou ebooks ao carrinho. 

public class CarrinhoDeCompras {
	// Armazena o valor em R$ total dos livros adicionados ao carrinho.
	private double total;
	// Declaração de array para armazenar os produtos adicionados à classe
	/**
	 * O ArrayList utiliza um array como estrutura interna e capsulada que facilita as operações sobre os dados. 
	 * List é mais geral que ArrayList ou LinkedList */
	private List<Produto> produtos;
	
	// Construtor
	public CarrinhoDeCompras() {
		this.produtos = new ArrayList<>();
	}
	
	// O tipo desse método é livro, porque tanto o LivroFisico quanto Ebook extends de Livro, ou seja, possuem o tipo Livro. 
	public void adiciona(Produto produto) {
		this.produtos.add(produto);
		
	}
	
	// Método para remover um determinado produto
	public void remove(int posicao) {
		this.produtos.remove(posicao);
	}
	
	
	// Método para retornar a lista de produtos
	public List<Produto> getProduto() {
		return produtos;
	}
	
	// Retorna o valor total dos produtos adicionados
	public double getTotal() {
		return this.total;
	}
	
	
}
