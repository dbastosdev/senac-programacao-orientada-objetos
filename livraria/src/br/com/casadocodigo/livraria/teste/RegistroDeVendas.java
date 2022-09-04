package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.helpers.CarrinhoDeCompras;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

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
	    
	    // Recuperando a lista de produtos registrados
	    
	    // 1- Instancia a classe / lista
	    Produto[] produtos = carrinho.getProduto();
	    
	    // 2- Percorre a lista de produtos - modelo de fazer um foreach no Java a partir do 1.5
	    for(Produto produto : produtos) {
	    	if(produto != null) {
	    		System.out.println(produto.getValor()); // 3- Imprime a lista se essa não for nula
	    	}
	    }
	    
	    System.out.println(" \nO valor total de livros comprados é: R$ " + carrinho.getTotal());
	}

}
