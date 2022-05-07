package cap06_Static_Exceptions;

/**
 * TestandoFormas.java
 * 
 * @author danil
 *
 */
public class TestandoFormas {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Quadrado quadradoA = new Quadrado("Azul");
		Quadrado quadradoB = new Quadrado("Amarelo");
		Quadrado quadradoC = new Quadrado("Verde");
		Quadrado quadradoD = new Quadrado("Vermelho");
		
		Triangulo trianguloA = new Triangulo("Laranja");
		Triangulo trianguloB = new Triangulo("Roxo");
		
		Circulo circuloA = new Circulo("Violeta");
		Circulo circuloB = new Circulo("Preto");
		Circulo circuloC = new Circulo("Cinza");
		
		System.out.printf(
				"\nForam gerados: \n%d quadrados,\n%d círculos, \n%d triângulos, \nTotal de %d geométrias.\n",
				Quadrado.qtd, Circulo.qtd, Triangulo.qtd, FormasGeometricas.qtd);
		
		quadradoD.setZoom(100);
		quadradoD.exibir();
		
		trianguloB.setZoom(80);
		trianguloB.exibir();
		
		circuloB.setZoom(130);
		circuloB.exibir();
		circuloC.setZoom(25);
		circuloC.exibir();
	}
}
