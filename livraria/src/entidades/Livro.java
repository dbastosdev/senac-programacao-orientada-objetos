package entidades;

public class Livro {
	
	// Atributos
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor; // Atributo especial do tipo autor que pertence a uma outra classe - composição.
	
	// Construtores
	public Livro() {
		System.out.println("Novo livro criado");
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
	public boolean aplicaDescontoDe(double porcentagem) {
		// Um livro pode ter no máximo 30% de desconto
		if(porcentagem > 0.3) {
			return false;
		} 
		this.valor -= this.valor * porcentagem;
		return true;
		
	}
	
	

}
