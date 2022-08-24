package livraria;

import entidades.Autor;
import entidades.Livro;

public class CadastroDeLivros {

	public static void main(String[] args) {
		
		// Instanciando e populando um objeto do tipo livro
		Livro livro = new Livro(); 
		
		livro.nome = "Java 8 Prático";
		livro.descricao = "Novos recursos da linguagem";
		livro.valor = 59.90;
		livro.isbn = "978-85-66250-46-6";
		
		// Instanciando e populando um objeto do tipo Autor
		Autor autor = new Autor();
		
		autor.nome = "Douglas Bastos";
		autor.email = "dbastos.autor@gmail.com";
		autor.cpf = "115.908.232-99";
		
		livro.autor = autor;
		
		if(!livro.aplicaDescontoDe(0.4)) { // Caso retorne falso, ou seja, desconto superior a 30% a mensagem é exibida. 
			System.out.println("Desconto não pode ser maior do que 30%");
		}
		 // Método para atribuir desconto
		livro.mostraDetalhes(); // Uso do método para mostrar detalhes
		

	}

}
