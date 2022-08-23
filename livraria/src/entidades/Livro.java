package entidades;

public class Livro {
	
	// Atributos
	public String nome;
	public String descricao;
	public double valor;
	public String isbn;
	public Autor autor; // Atributo especial do tipo autor que pertence a uma outra classe - composição.
	
	// Construtor -> Possui mesmo nome da classe
	public Livro() {
		System.out.println("Novo livro criado");
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
	
	public void aplicaDesconto(double porcentagem) {
		this.valor -= this.valor * porcentagem;
	}
	
	

}
