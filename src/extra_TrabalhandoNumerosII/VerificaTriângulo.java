package extra_TrabalhandoNumerosII;

import java.util.Scanner;

public class VerificaTriângulo {
	
	public static void main(String[] args) {
		
		Double[] lado = new Double[3];
		
		try (Scanner input = new Scanner(System.in)) {
			for (int i = 0; i < 3; i++) {
				System.out.printf("Informe o lado %d: ", i + 1);
				lado[i] = input.nextDouble();
			}
		}
		if ((lado[0] < lado[1] + lado[2]) && (lado[1] < lado[0] + lado[2])
				&& (lado[2] < lado[0] + lado[1])) {
			if (lado[0].equals(lado[1]) && lado[0].equals(lado[2])) {
				System.out.println("É um equilátero");
			} else if (!lado[0].equals(lado[1]) && !lado[1].equals(lado[2])
					&& !lado[2].equals(lado[0])) {
				System.out.println("É um escaleno");
			} else {
				System.out.println("É um isósceles");
			}
		} else {
			System.out.println("Não pode ser um triângulo.");
		}
	}
}
