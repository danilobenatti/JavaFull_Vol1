package extra_TrabalhandoNumerosII;

import java.text.NumberFormat;
import java.util.Locale;

public class CalculaSalario {
	
	public static void main(String[] args) {
		
		Locale locale = new Locale("pt", "BR");
		
		String nome = "João Paulo";
		int idade = 35;
		String cargo = "Assistente de Logística";
		double bruto = 3500.00; // salário bruto, ex.: R$ 2.500,00.
		double reajuste = 12.62; // reajuste, ex.: 12.62%
		double bonus = 2.52; // bonus, ex.: 2.52%
		double tax = 5.35; // imposto, ex.: 5.35%
		
		double reajusteAnual = calculateReadjustment(bruto, reajuste);
		double bonusAnual = calculateReadjustment(bruto, bonus);
		double liquido = (bruto + reajusteAnual + bonusAnual) * (1 - tax / 100);
		
		System.out.printf("%s, %d anos, cargo: %s%n", nome, idade, cargo);
		System.out.printf("Salário atual: %s%n", printValue(bruto, locale));
		System.out.printf("Salário líquido: %s%n", printValue(liquido, locale));
	}
	
	public static String printValue(double value, Locale locale) {
		return NumberFormat.getCurrencyInstance(locale).format(value);
	}
	
	public static double calculateReadjustment(double value, double percent) {
		return value * (percent / 100);
	}
}
