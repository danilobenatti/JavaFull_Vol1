package extra_TrabalhandoNumerosII;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CalculaMedia {
	
	public static void main(String[] args) {
		
		Locale locale = new Locale("pt", "BR");
		NumberFormat nf = NumberFormat.getNumberInstance(locale);
		List<Double> numbers = new ArrayList<>();
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite valores numéricos ('q' para sair).");
			boolean repetir = true;
			int i = 0;
			while (repetir) {
				System.out.printf("valor (%d): ", ++i);
				if (input.hasNextDouble()) {
					numbers.add(input.nextDouble());
				} else {
					repetir = false;
				}
			}
			System.out.println(numbers.toString());
			double sum = 0;
			for (Double number : numbers) {
				sum += number;
			}
			System.out.println("A média é: " + nf.format(sum / numbers.size()));
		}
	}
}
