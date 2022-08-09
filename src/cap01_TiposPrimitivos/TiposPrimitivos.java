package cap01_TiposPrimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite um nome: ");
			String nome = scanner.nextLine();
			System.out.print("Informe a idade: ");
			int idade = scanner.nextInt();
			System.out.print("Informe o peso[Kg]: ");
			float peso = scanner.nextFloat();
			System.out.printf("nome: %s, idade: %d, peso %.2f", nome, idade, peso);

			String valor1 = String.valueOf(peso);
			System.out.printf("%nEx.1: %s", valor1);
			String valor2 = Float.toString(peso);
			System.out.printf("%nEx.2: %s", valor2);
			
			String valor3 = "30";
			idade = Integer.parseInt(valor3);
			System.out.printf("%nEx.3: %d", idade);
		}
	}

}
