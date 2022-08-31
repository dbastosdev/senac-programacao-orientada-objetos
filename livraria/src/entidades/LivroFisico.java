package entidades;

import Interfaces.Promocional;

public class LivroFisico extends Livro implements Promocional{
	// atributos são os mesmos de Livro
	
	// construtor
	public LivroFisico(Autor autor) {
		super(autor);
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		// reescrevendo o método uma vez que o padrão é não ter desconto. 
		if(porcentagem > 0.3) {
			return false;
		}
		
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		System.out.println("aplicando desconto no Livro Físico");
		return true;
	}
}
