package extra_MathAverage;

import java.util.ArrayList;

/**
 * 
 * @soruce https://www.tutorialkart.com/java/java-average
 */
public class Average {

	public static void main(String[] args) {

		String titleText = "%s %.2f%n----- # -----%n";
		String resultText = "Average: ";
		int[] numbers = { 1, 2, 3, 4, 5, 6 };

		/**
		 * Exemplo 1
		 */
		float sum = 0;
		int i = 0;
		while (i < numbers.length) {
			sum += numbers[i];
			i++;
		}

		float average = (sum / numbers.length);
		System.out.printf(titleText, resultText, average);

		/**
		 * Exemplo 2
		 */
		sum = 0;
		for (double number : numbers) {
			sum += number;
		}

		average = (sum / numbers.length);
		System.out.printf(titleText, resultText, average);

		/**
		 * Exemplo 3
		 */
		sum = 0;
		ArrayList<Double> arrayList = new ArrayList<>();
		for (double value : numbers) {
			arrayList.add(value);
		}

		for (double number : arrayList) {
			sum += number;
		}

		average = (sum / arrayList.size());
		System.out.printf(titleText, resultText, average);
	}
}
