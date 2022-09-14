package br.com.dbastosdev.classes;

public class Pessoa {
	// Atributos
	private String nome;
	private int CPF;
	private String email;
	
	
	// Getters e Settters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		if(validar_CPF(cPF)) {
			CPF = cPF;			
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// Métodos
	private boolean validar_CPF(int cpf) {
		// Acesso a api da receita federal
		return true;
	}
	
}
