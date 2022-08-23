
public class Driver {

	public static void main(String[] args) {
		
		// Instanciação de pontos
		Ponto pa = new Ponto(2, -3);
		Ponto pb = new Ponto(4, 5);
		
		Ponto pc = new Ponto();
		Ponto pd = new Ponto();
		
		// Coordenadas
		System.out.println("Coordenadas dos pontos: \n");
		System.out.println("(xa ="+pa.getX()+"; ya ="+pa.getY()+")");
		System.out.println("(xb ="+pb.getX()+"; yb ="+pb.getY()+")");
		System.out.println("(xc ="+pc.getX()+"; yc ="+pc.getY()+")");
		System.out.println("(xd ="+pd.getX()+"; yd ="+pd.getY()+")");
		System.out.println("\n");
		
		// Uso do método pontos iguais:
		System.out.println("Comparação de coordenadas pa e pb / pc e pd: \n");
		System.out.println("Pontos de mesmo valor - pa e pb: " + pa.pontosDeMesmoValor(pb));
		System.out.println("Pontos de mesmo valor - pc e pd: " + pc.pontosDeMesmoValor(pd));
		System.out.println("\n");
		
		// Uso do método distância entre dois pontos: 
		System.out.println("Distancia entre os pontos pa e pb / pc e pd: \n");
		System.out.println("A distância entre os pontos pa e pb é: " + pa.distanciaEntreDoisPontos(pb));
		System.out.println("A distância entre os pontos pc e pd é: " + pc.distanciaEntreDoisPontos(pd));
	}

}
