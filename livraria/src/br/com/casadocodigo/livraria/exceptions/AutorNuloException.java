package br.com.casadocodigo.livraria.exceptions;

public class AutorNuloException extends RuntimeException{
	
	public AutorNuloException(String msg) {
		super(msg);  // Delega para a superclasse a emissão da mensagem de exception
	}
}
