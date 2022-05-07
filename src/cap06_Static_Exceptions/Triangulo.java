package cap06_Static_Exceptions;

/**
 * Triangulo.java
 * 
 * @author danil
 *
 */
public class Triangulo extends FormasGeometricas {
	
	public static int qtd;
	
	public Triangulo(String cor) {
//		this.qtd++;
		Triangulo.qtd++;
		super.setNome("Triangulo");
		super.setCor(cor);
	}
}
