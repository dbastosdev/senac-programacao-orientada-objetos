package livraria;

import entidades.Autor;
import entidades.Ebook;
import entidades.LivroFisico;
import tools.CarrinhoDeCompras;

public class RegistroDeVendas {

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Douglas Bastos");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Java 8");
		fisico.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Driven Development");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		// Os códigos abaixo vão retornar um endereço estranho, referente ao ponteiro relativo aos objtos ebook e livro físico
		// Pois foram declarados como Livro na classe de carrinho de compras. 
	    carrinho.adiciona(fisico);
	    carrinho.adiciona(ebook);
	    
	    System.out.println(" \nO valor total de livros comprados é: R$ " + carrinho.getTotal());
	}

}
