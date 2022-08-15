package extra_TrabalhandoNumerosII;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CalculaMediaII {
	
	static Double sum = 0.0;
	
	public static void main(String[] args) {
		
		Locale locale = new Locale("pt", "BR");
		NumberFormat nf = NumberFormat.getNumberInstance(locale);
		List<Double> numbers = new ArrayList<>();
		
		try (Scanner input = new Scanner(System.in)) {
			
			boolean condition = true;
			do {
				System.out.print("Digite um número: ");
				numbers.add(input.nextDouble());
				System.out.print("Informar outro número?(s/n): ");
				condition = input.next().equalsIgnoreCase("s");
			} while (condition);
			
			if (numbers.isEmpty()) {
				System.out.println("Deve-se informar números para calcular!");
			} else {
				for (Double number : numbers) {
					sum += number;
				}
				System.out.printf("Números: %s%n", numbers.toString());
				System.out.println("Média: " + nf.format(sum / numbers.size()));
				
				DoubleSummaryStatistics dss = numbers.stream()
						.mapToDouble(a -> a).summaryStatistics();
				System.out.println("Números: " + dss.toString());
				System.out.println("Média: " + nf.format(dss.getAverage()));
				
				sum = 0.0;
				for (int i = 0; i < numbers.size(); i++) {
					sum += numbers.get(i);
				}
				System.out.println("Média: " + nf.format(sum / numbers.size()));
				
				sum = 0.0;
				Double[] numbers2 = numbers.toArray(new Double[0]);
				for (Double number : numbers2) {
					sum += number;
				}
				System.out.println("Números: " + Arrays.toString(numbers2));
				System.out.println("Avg: " + nf.format(sum / numbers2.length));
			}
		}
	}
	
}
