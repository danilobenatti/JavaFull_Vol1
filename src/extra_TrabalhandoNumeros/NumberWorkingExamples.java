package extra_TrabalhandoNumeros;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Locale;

public class NumberWorkingExamples {

	public static void main(String[] args) {

		Locale localeBr = new Locale("pt", "BR");
		Locale localeUs = new Locale("en", "US");

		// Exemplo 1
		float myFloat = 15080.80f;
		String formattedString1 = String.format(localeBr, "%.2f", myFloat);
		System.out.println("BR: " + formattedString1);
		String formattedString2 = String.format(localeUs, "%.2f", myFloat);
		System.out.println("US: " + formattedString2);

		// Exemplo 2
		float num = 2.456534f;
		try (Formatter formatter = new Formatter()) {
			formatter.format(localeBr, "%.2f", num);
			System.out
					.println("Upto 2 decimal places: " + formatter.toString());
		}

		// Exemplo 3
		BigDecimal bd = BigDecimal.valueOf(num).setScale(3,
				RoundingMode.HALF_EVEN);
		System.out.println("Upto 3 HALF_EVEN: " + bd.doubleValue());
		BigDecimal bdDown = BigDecimal.valueOf(num).setScale(3,
				RoundingMode.DOWN);
		System.out.println("Upto 3 DOWN: " + bdDown.doubleValue());
		BigDecimal bdUp = BigDecimal.valueOf(num).setScale(3, RoundingMode.UP);
		System.out.println("Upto 3 UP: " + bdUp.doubleValue());

		// Exemplo 4
		DecimalFormat decimalFormat = new DecimalFormat("#.#");
		double d = 2.456534;
		System.out.println("Upto 1 decimal places: " + decimalFormat.format(d));

		// Exemplo 5
		double d1 = 2500.096;
		double d2 = 2500.979;
		NumberFormat numberFormat = NumberFormat.getNumberInstance(localeBr);
		numberFormat.setMaximumFractionDigits(2);
		System.out.println("d1 - 2 decimal places: " + numberFormat.format(d1));
		numberFormat.setMaximumFractionDigits(1);
		System.out.println("d2 - 1 decimal places: " + numberFormat.format(d2));
	}
}
