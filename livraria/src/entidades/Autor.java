package entidades;

public class Autor {
	// Atributos
	public String nome;
	public String email;
	public String cpf;
	
	// Métodos
	public void mostraDetalhes() {
		System.out.println("Autor: "+this.nome);
		System.out.println("Email do autor: "+this.email);
		System.out.println("Cpf do autor: "+this.cpf);
	}

}
