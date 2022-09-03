package br.com.casadocodigo.livraria.produtos;

/*
 * Nem todas as classes utilizam o método aplica desconto. Logo nem todos os produtos são promocionais.
 * É boa prática utilizar apenas um método para uma interface. Quando uma interfac possui apenas um método abstrato.
 * ela é chamada de interface funcional e recebe uma anotação especial. Se houver mais um método para de compilar. 
 * Contudo podemos ter quantos default methods desejarmos.
 * */

@FunctionalInterface
public interface Promocional {
	
	boolean aplicaDescontoDe(double porcentagem); // Cláusula que deve ser implementada
	
	
	// Método padrão que poderá ser usado em qualquer classe que implemente Promocional.
	// Esse default method nada mais faz que usar o método da interface que será implementado e obrigar a passagem do parâmetro
	// de 10% de desconto.
	default boolean aplicaDescontoDe10Porcento() {
		return aplicaDescontoDe(0.1); // Essa implementação será obrigatória na classe que usar a interface. 
	}; 
}
