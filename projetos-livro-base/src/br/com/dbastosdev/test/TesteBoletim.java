package br.com.dbastosdev.test;

import br.com.dbastosdev.classes.Boletim;

public class TesteBoletim {

	public static void main(String[] args) {
		
		Boletim b1 = new Boletim();
		Boletim b2 = new Boletim();

		b1.nota = 10;
		b1.frequencia = 100;
		b1.status = "Aprovado";
		
		b2.nota = 9;
		b2.frequencia = 85;
		b2.status = "Aprovado";
		
		
	}

}
