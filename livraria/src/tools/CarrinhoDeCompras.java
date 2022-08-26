package tools;

import entidades.Livro;

// Carrinho de compras é uma classe utilizada para adicionar livros, sejam físicos ou ebooks ao carrinho. 

public class CarrinhoDeCompras {
	// Armazena o valor em R$ total dos livros adicionados ao carrinho.
	private double total;
	
	
	// O tipo desse método é livro, porque tanto o LivroFisico quanto Ebook extends de Livro, ou seja, possuem o tipo Livro. 
	public void adiciona(Livro livro) {
		System.out.println("Adicionado: " + livro + " - R$ " + livro.getValor());
		livro.aplicaDescontoDe(0.05); // Aplica 5% de desconto a cada livro adicionado
		this.total += livro.getValor();
		
	}
	
	public double getTotal() {
		return this.total;
	}
}
