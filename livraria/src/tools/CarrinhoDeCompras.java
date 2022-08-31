package tools;

import Interfaces.Produto;

// Carrinho de compras é uma classe utilizada para adicionar livros, sejam físicos ou ebooks ao carrinho. 

public class CarrinhoDeCompras {
	// Armazena o valor em R$ total dos livros adicionados ao carrinho.
	private double total;
	
	
	// O tipo desse método é livro, porque tanto o LivroFisico quanto Ebook extends de Livro, ou seja, possuem o tipo Livro. 
	public void adiciona(Produto produto) {
		System.out.println("Adicionado: " + produto + " - R$ " + produto.getValor());
		this.total += produto.getValor();
		
	}
	
	public double getTotal() {
		return this.total;
	}
}
