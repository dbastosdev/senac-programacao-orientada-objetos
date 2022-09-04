package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

/*
 * Livro deve ser apenas uma abstração das entidades que serão criadas com base em sua definição. 
 * Dessa forma, essa classe não deve ser instânciada. A melhor forma de fazer isso é transformando-a em uma classe abstrata.
 * 
 * Isso causará um erro de compilação ao se tentar instanciar uma classe livro. 
 */

public abstract class Livro implements Produto {
	
	// Atributos
	private String nome;
	private String descricao;
	protected double valor;
	private String isbn;
	private Autor autor; // Atributo especial do tipo autor que pertence a uma outra classe - composição.
	
	// Construtores
	
	// Construtor padrão
	public Livro() {
		// Inicialização do ISBN zerado para não vir com null. Número vem depois do cadastro do livro. 
		this.isbn = "000-00-00000-00-0";
	}
	
	// Autor é um atributo obrigatório da classe livro. Logo, precisamos dessa atributo para cadastrar um livro.
	public Livro(Autor autor) {
		
		this(); // Encadea chamando o outro construtor com a atribuição do isbn
		
		// Criando e tratando uma Exception
		if(autor == null) {
			throw new RuntimeException("O autor de Livro não pode ser nulo");
		}
		
		
		this.autor = autor;
		
	}
	
	
	
	// getters e setters: 
	public String getNome() {
		return nome;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	// Métodos
	public void mostraDetalhes() {
		System.out.println("Mostrando detalhes do livro: \n ");
		System.out.println("Nome: "+this.nome);
		System.out.println("Descrição: "+this.descricao);
		System.out.println("Valor: R$ "+this.valor);
		System.out.println("ISBN: "+this.isbn);
		System.out.println("--");
		System.out.println("Detalhes do autor: \n ");
		this.autor.mostraDetalhes();
	
	}

	
	

	// Retorno do método é boolean pois ele atualiza um atributo interno de livro.
//	public boolean aplicaDescontoDe(double porcentagem) {
//		// Um livro pode ter no máximo 30% de desconto
////		if(porcentagem > 0.3) {
////			return false;
////		} 
////		this.valor -= this.valor * porcentagem;
////		return true;
//		return false;
//		
//	}
	
	/*
	 * Melhorando ainda mais o código, basta criarmos um método também abstrado dentro dessa classe para que ele seja
	 * de implementação obrigatória nas subclasses.
	 * 
	 * Apenas classes abstratas podem ter métodos abstratos
	 */
	
//	public abstract boolean aplicaDescontoDe(double porcentagem);
	
	

}
