package br.com.casadocodigo.livraria.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.helpers.ComparadorPorNome;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class NovidadesDoJava8 {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Livro javaoo = new LivroFisico(autor);
		javaoo.setNome("Java O.O.");
		
		Livro java8 = new LivroFisico(autor);
		java8.setNome("Java 8 prático");
		
		Livro ruby = new LivroFisico(autor);
		ruby.setNome("Livro de Ruby");
		
		List<Livro> livros = Arrays.asList(javaoo, java8, ruby);
		
		
        Collections.sort(livros, new ComparadorPorNome()); // Em que comparador por nome é uma classe. Para cada tipo de comparação, até o java 7 é necessária uma classe.
		
		for(Livro livro : livros) {
			System.out.println(livro.getNome());
		}
		
		System.out.println("\n\n");
		
		List<Livro> filtrados = new ArrayList<>();
		
		for(Livro livro : livros) {
			if(livro.getNome().contains("Java")) {
				filtrados.add(livro);
			}
		}
		
		for(Livro livro : filtrados) {
			System.out.println(livro.getNome());
		}
		
	}
}
