package cap06_Static_Exceptions;

/**
 * Quadrado.java
 * 
 * @author danil
 *
 */
public class Quadrado extends FormasGeometricas {
	
	public static int qtd;
	
	public Quadrado(String cor) {
//		this.qtd++;
		Quadrado.qtd++;
		super.setNome("Quadrado");
		super.setCor(cor);
	}
}
