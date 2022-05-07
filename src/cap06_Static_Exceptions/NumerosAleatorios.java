package cap06_Static_Exceptions;

/**
 * NumerosAleatorios.java
 *
 * @author danil
 *
 */
public class NumerosAleatorios {
	
	public static void main(String[] args) {
		
		int numeroCapturado = Integer.parseInt(args[0]);
		
		for (int i = 0; i < numeroCapturado; i++) {
			System.out.printf("%.5f\n", Math.random());
		}
	}
	
}
