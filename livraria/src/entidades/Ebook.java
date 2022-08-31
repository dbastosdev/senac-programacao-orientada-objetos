package entidades;

import Interfaces.Promocional;

// Um ebook é um livro. Logo possui todos os atributos e métodos associados a um livro. 
// Com isso, é possível o reaproveitamento de código. 
public class Ebook extends Livro implements Promocional{
	
	// atributos
	private String waterMark;
	
	// Construtores
	public Ebook(Autor autor) {
		super(autor); // Essa linha de código delega à superclasse Livro a tarefa de atribuir o objeto autor ao atributo Autor. 
	}
	
	public Ebook() {
		super();
	}
	
	// getters e setters
	public void setWaterMark(String waterMark) {

	}

	public String getWaterMark() {
		return waterMark;
	}

	// Sobreescrita de métodos. Polimorfismo dinâmico. A anotação Override faz com que o código não compile se não tiver sido declarado
	// na classe pai.
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.15) {
			return false;
		}
		// valor teve que ter seu atributo valor modificado para protected para ser acessível
		// uma alternativa seria usar this.setValor( ... ) no lugar de this.valor que é um acesso direto. 
		this.valor -= this.valor * porcentagem; 
		return true;
	}
}
