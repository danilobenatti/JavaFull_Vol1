package cap06_Static_Exceptions;

import java.util.Scanner;

/**
 * EntradaDeDados.java
 * 
 * @author danil
 *
 */
public class EntradaDeDados {
	
	public static void main(String[] args) {
		
		final int QTD_NOTAS = 4;
		
		//instancia o objeto Scanner
		Scanner scanner = new Scanner(System.in);
		
		Double[] notas = new Double[QTD_NOTAS];
		for (int i = 0; i < QTD_NOTAS; i++) {
			System.out.print("Entre com a nota " + (i + 1) + ":");
			notas[i] = scanner.nextDouble();
		}
		
		Double somaTotal = 0.0;
		System.out.print("Notas informadas:");
		for (Double nota : notas) {
			System.out.print(" " + nota + " ");
			somaTotal = somaTotal + nota;
		}
		
		Double media = somaTotal/QTD_NOTAS;
		System.out.printf("\nMédia final: %.2f", media);
		
		//encerra o objeto Scanner
		scanner.close();
	}
}
