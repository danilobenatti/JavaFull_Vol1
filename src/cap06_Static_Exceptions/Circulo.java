package cap06_Static_Exceptions;

/**
 * Circulo.java
 * 
 * @author danil
 *
 */
public class Circulo extends FormasGeometricas {
	
	public static int qtd;
	
	public Circulo(String cor) {
//		this.qtd++;
		Circulo.qtd++;
		super.setNome("Circulo");
		super.setCor(cor);
	}
}
