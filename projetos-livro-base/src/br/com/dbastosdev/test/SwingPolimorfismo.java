package br.com.dbastosdev.test;

import javax.swing.Icon;
import javax.swing.JOptionPane;

import br.com.dbastosdev.classes.Boletim;

public class SwingPolimorfismo {

	public static void main(String[] args) {
		
		// Objetos boletim
		Boletim b1 = new Boletim(9, 98, "Aprovado");
		Boletim b2 = new Boletim("Reprovado");
		
		double m_grad = b1.calcular_media(9.5, 4.7, 6.9);
		double m_pos = b2.calcular_media(7.4, 9.2);
		
	    JOptionPane.showMessageDialog(null, "A média do aluno de graduação é " + m_grad + "\nA média do aluno de pós-graduação é " + m_pos, "BOLETIM", JOptionPane.PLAIN_MESSAGE);

	}

}
