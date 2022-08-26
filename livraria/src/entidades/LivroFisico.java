package entidades;

public class LivroFisico extends Livro{
	// atributos são os mesmos de Livro
	
	// construtor
	public LivroFisico(Autor autor) {
		super(autor);
	}
	
	public double getTaxaImpressao() {
		return this.getValor() * 0.05; // Não precisou modificar a visibilidade do atributo
	}
}
