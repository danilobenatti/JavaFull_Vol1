package extra_TrabalhandoNumeros;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
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
		BigDecimal bd = BigDecimal.valueOf(num).setScale(2,
				RoundingMode.HALF_EVEN);
		System.out.println("Upto 2 HALF_EVEN: " + bd.doubleValue());
		BigDecimal bdDown = BigDecimal.valueOf(num).setScale(2,
				RoundingMode.DOWN);
		System.out.println("Upto 2 DOWN: "
				+ String.format(localeBr, "%.4f", bdDown.doubleValue()));
		BigDecimal bdUp = BigDecimal.valueOf(num).setScale(3, RoundingMode.UP);
		System.out.println("Upto 2 UP: " + bdUp.doubleValue());
		
		// Exemplo 4
		DecimalFormat decimalFormat = new DecimalFormat("#.#");
		double d = 2.456534;
		System.out.println("Upto 1 decimal places: " + decimalFormat.format(d));
		
		// Exemplo 5
		double d1 = 2500.096;
		double d2 = 2500.979;
		NumberFormat nf1 = NumberFormat.getNumberInstance(localeBr);
		NumberFormat nf2 = NumberFormat.getNumberInstance(localeUs);
		nf1.setMaximumFractionDigits(2);
		nf1.setMinimumFractionDigits(2);
		System.out.println(d1 + " - 2 decimal places: " + nf1.format(d1));
		nf2.setMaximumFractionDigits(1);
		nf2.setMinimumFractionDigits(1);
		System.out.println(d2 + " - 1 decimal places: " + nf2.format(d2));
		
		displayNumber(123456.789, localeUs);
		displayNumber(345987.246, localeBr);
		
		String dollar = "$1,998.08";
		String real = "R$ 3.999,50";
		String real2 = "R$2500,50";
		// convertendo valores monetários para numéricos
		try {
			System.out.println(parse(dollar, localeUs));
			System.out.println(parse(real, localeBr));
			System.out.println(parse(real2, localeBr));
			System.out.println(parse(real2, localeBr).getClass());
		} catch (ParseException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void displayNumber(Object number, Locale locale) {
		NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
		String numOut = numberFormat.format(number);
		System.out.println(numOut + "   " + locale.toString());
	}
	
	public static BigDecimal parse(String amount, Locale locale)
			throws ParseException {
		NumberFormat nf = NumberFormat.getNumberInstance(locale);
		if (nf instanceof DecimalFormat) {
			((DecimalFormat) nf).setParseBigDecimal(true);
		}
		return (BigDecimal) nf.parse(amount.replaceAll("[^\\d.,]", ""));
	}
}
