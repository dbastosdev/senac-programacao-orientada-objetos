package livraria;

import entidades.Autor;
import entidades.Livro;

public class CadastroDeLivros {

	public static void main(String[] args) {
		
		// Instanciando e populando um objeto do tipo livro
		Livro livro = new Livro(); 
		// Refatorado usando métodos para preenchimento dos atributos
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		livro.setIsbn("978-85-66250-46-6");
		
		// Instanciando e populando um objeto do tipo Autor
		Autor autor = new Autor();
		// Refatorado usando métodos para preenchimento dos atributos
		autor.setNome("Douglas Bastos");
		autor.setEmail("dbastos.autor@gmail.com");
		autor.setCpf("115.908.232-99");
		
		// Atribuindo um autor a um livro
		livro.setAutor(autor);
		
		if(!livro.aplicaDescontoDe(0.4)) { // Caso retorne falso, ou seja, desconto superior a 30% a mensagem é exibida. 
			System.out.println("Desconto não pode ser maior do que 30%");
		}
		 // Método para atribuir desconto
		livro.mostraDetalhes(); // Uso do método para mostrar detalhes
		

	}

}
