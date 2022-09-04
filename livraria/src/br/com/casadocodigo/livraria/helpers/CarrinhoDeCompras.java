package br.com.casadocodigo.livraria.helpers;

import br.com.casadocodigo.livraria.produtos.Produto;

// Carrinho de compras é uma classe utilizada para adicionar livros, sejam físicos ou ebooks ao carrinho. 

public class CarrinhoDeCompras {
	// Armazena o valor em R$ total dos livros adicionados ao carrinho.
	private double total;
	// Declaração de array para armazenar os produtos adicionados à classe
	private Produto[] produtos = new Produto[10];
	private int contador = 0; // Esse contador irá armazenar o índice do array
	
	// O tipo desse método é livro, porque tanto o LivroFisico quanto Ebook extends de Livro, ou seja, possuem o tipo Livro. 
	public void adiciona(Produto produto) {
		System.out.println("Adicionado: " + produto + " - R$ " + produto.getValor());
		this.total += produto.getValor();
		this.produtos[contador] = produto;
		contador++;
		
	}
	
	// Método para retornar a lista de produtos
	public Produto[] getProduto() {
		return produtos;
	}
	
	// Retorna o valor total dos produtos adicionados
	public double getTotal() {
		return this.total;
	}
	
	
}
