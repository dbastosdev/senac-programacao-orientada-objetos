package br.com.dbastosdev.classes;

public class Boletim {
	
	// Atributos
	private float nota;
	private int frequencia;
	private String status;
	
	// Construtor da classe Boletim
	public Boletim(float n, int f, String st) {
		setBoletim(n,f,st);
	}
	
	public Boletim(String st) {
		setBoletim(0,0,st);
	}
	
	
	public Boletim() {
		this(10, 100, null); // preenche os atributos da classe
	}
	
	public void setBoletim(float n, int f, String st) {
		setNota(n);
		setFrequencia(f);
		setStatus(st);
	}
	
	
	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public int getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	/*
	 * Usando polimorfismo estático (sobrecarga) para o cálculo de média
	 * 
	 * GRADUAÇÃO:
	 * 
	 * AM = Avaliação Multidisciplinar (e vale 30% da média)
	 * AC = Avaliação Continuada (e vale 20% da média)
	 * AS = Avaliação Semestral (e vale 50% da média)
	   MS = Média Semestral
	   
	   PÓS-GRADUAÇÃO:
	   
	   PM = Projeto Multidisciplinar (e vale 40% da média)
	   AS = Avaliação Semestral (e vale 60% da média)
	   MM = Média Modular
	   
     */
	
	// Cálculo da graduação
	public double calcular_media(double AM, double AC, double AS) {
		return  (AM * 0.3) + (0.2 * AC) + (0.5 * AS); 
	}
	
	// Cálculo da graduação
	public double calcular_media(double PM, double AS) {
		return (PM * 0.4) + (AS * 0.6); 
	}

	// inserir esse método na classe Boletim
	public void imprimir() {
			System.out.println(getNota() + "\n" + getFrequencia() + "\n" + getStatus() + "\n");
	}


}
