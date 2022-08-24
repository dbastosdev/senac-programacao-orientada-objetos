package entidades;

public class Autor {
	// Atributos
	private String nome;
	private String email;
	private String cpf;

	// Construtor
	
	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	// Métodos
	public void mostraDetalhes() {
		System.out.println("Autor: "+this.nome);
		System.out.println("Email do autor: "+this.email);
		System.out.println("Cpf do autor: "+this.cpf);
	}

	

}
