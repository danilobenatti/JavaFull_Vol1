package extra_TrabalhandoNumerosII;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class VerificaIdade {
	
	public static void main(String[] args) {
		
		List<Integer> idades = new ArrayList<>();
		
		try (Scanner input = new Scanner(System.in)) {
			for (int i = 0; i < 5; i++) {
				System.out.printf("Informe idade %d: ", i + 1);
				idades.add(input.nextInt());
			}
		} catch (InputMismatchException ex) {
			System.out.println("Valor inválido.");
			ex.getMessage();
		}
		
		int idadeMaior = 0;
		for (Integer idade : idades) {
			if (idade > idadeMaior) {
				idadeMaior = idade;
			}
		}
		System.out.printf("%nIdade mais velha é: %s anos", idadeMaior);
		
		int soma = 0;
		int i = 0;
		for (Integer idade : idades) {
			soma += idade;
			i++;
		}
		if (i > 0) {
			System.out.printf("%nIdade Média é: %.2f anos", (double) soma / i);
		}
		
		int j = 0;
		for (Integer idade : idades) {
			if (idade > 20) {
				j++;
			}
		}
		if (j == 5) {
			System.out.printf("%nTodas as idades são maiores de 20 anos");
		} else if (j > 0){
			System.out.printf("%n%d idade(s) superior(es) a 20 anos.", j);
		} else {
			System.out.printf("%nTodas as idades são menores de 20 anos");
		}
	}
}
