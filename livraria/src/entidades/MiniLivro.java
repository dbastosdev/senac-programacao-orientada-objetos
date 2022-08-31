package entidades;

public class MiniLivro extends Livro {
	
	// Construtor que utiliza o construtor da classe Livro
	public MiniLivro(Autor autor) {
		super(autor);
	}

	
	
	// Reescrevendo o método de aplicação de desconto para que não seja ofertado desconto ao minilivro.
//	@Override
//	public boolean aplicaDescontoDe(double porcentagem) {
//		return false;
//	}
	
	
	// Com a classe livro tendo o padrão de não dar desconto, o comportamento nas subclasses só precisa editiar o método de ofertar
	// desconto quanto necessário. Por isso, miniLivro não tem desconoto e usa o método de forma herdada.
	
}
	
