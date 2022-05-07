package cap06_Static_Exceptions;

import java.io.IOException;

/**
 * ExcecoesComStreamIn.java
 * 
 * @author danil
 *
 */
public class ExcecoesComStreamIn {
	
	public static void main(String[] args) throws IOException {
		
		String nome = "", salarioString = "";
		double salarioDouble = 0.0;
		char letra;
		
		System.out.print("Digite o nome: ");
		while ('\n' != (letra = (char) System.in.read())) {
			nome += String.valueOf(letra);
			System.in.skip(0);
		}
		
		System.out.print("Digite o salário: ");
		while ('\n' != (letra = (char) System.in.read())) {
			salarioString += String.valueOf(letra);
			System.in.skip(0);
		}
		
		salarioDouble = Double.parseDouble(salarioString);
		
		System.out.printf("Nome: %s\nSalário: %3.2f.", nome, salarioDouble);
		
	}
}
