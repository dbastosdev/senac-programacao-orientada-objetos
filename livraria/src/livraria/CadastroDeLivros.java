package livraria;

import entidades.Autor;
import entidades.Ebook;
import entidades.Livro;
import entidades.LivroFisico;
import entidades.MiniLivro;

public class CadastroDeLivros {

	public static void main(String[] args) {
		
		// Instanciando e populando um objeto do tipo Autor
		Autor autor = new Autor();
		// Refatorado usando métodos para preenchimento dos atributos
		autor.setNome("Douglas Bastos");
		autor.setEmail("dbastos.autor@gmail.com");
		autor.setCpf("115.908.232-99");
				
		
		// Instanciando e populando um objeto do tipo livro
		Livro livro = new LivroFisico(autor); // Aqui está sendo instanciado LivroFisico e não um Livro.
		// Refatorado usando métodos para preenchimento dos atributos
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
//		livro.setIsbn("978-85-66250-46-6");
		
			
		if(!livro.aplicaDescontoDe(0.4)) { // Caso retorne falso, ou seja, desconto superior a 30% a mensagem é exibida. 
			System.out.println("Desconto não pode ser maior do que 30%");
		}
		 // Método para atribuir desconto
		livro.mostraDetalhes(); // Uso do método para mostrar detalhes
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Java 8");
		
		ebook.mostraDetalhes();
		
		Livro miniLivro = new MiniLivro(autor);
		miniLivro.setNome("Java 11");
		System.out.println(miniLivro.aplicaDescontoDe(0.2));
		miniLivro.setValor(59.90);
		miniLivro.mostraDetalhes();
		

	}

}
