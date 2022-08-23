
public class Ponto {
	
	// Atributos
	private int x, y;
		
	// A) Construtores - sobrecarga estática
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Ponto() {
		this.x = 0;
		this.y = 0;
	}
	
	// Getters e Setters
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.x = y;
	}
	
	
	// B) Métodos
	public boolean pontosDeMesmoValor(Ponto p) {
		if(p.getX() == this.x && p.getY() == this.y) {
			return true;			
		} else {
			return false;
		}
	}
	
		
	public double distanciaEntreDoisPontos(Ponto p) {
		return Math.sqrt((Math.pow(p.getX() - this.x, 2)) + (Math.pow(p.getY() - this.y, 2)));
	}

}
