package br.com.dbastosdev.test;

import java.util.Scanner;

import br.com.dbastosdev.classes.Boletim;

public class TesteBoletim {

	public static void main(String[] args) {
		
		float nota;
		int frequencia;
		String status;
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Insira a nota de início");
		nota = ler.nextFloat();
		System.out.println("Insira a frequência de início");
		frequencia = ler.nextInt();
		System.out.println("Insira o status de início");
		status = ler.next();
				
		Boletim B1 = new Boletim(nota,frequencia,status);
		Boletim B2 = new Boletim();
		Boletim B3 = new Boletim("APROVADO");
		
		System.out.println("Uso do construtor com 3 parâmetros: ");
		B1.imprimir();
		System.out.println("Uso do construtor com nenhum parâmetro: ");
		B2.imprimir();
		System.out.println("Uso do construtor com 2 parâmetros: ");
		B3.imprimir();
		
		
	}

}
