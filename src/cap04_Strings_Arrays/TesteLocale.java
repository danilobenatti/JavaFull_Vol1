package cap04_Strings_Arrays;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class TesteLocale {

	public static void main(String[] args) {

		System.out.println(Locale.getDefault(Locale.Category.DISPLAY));
		System.out.println(Locale.getDefault(Locale.Category.FORMAT));

		Locale locale = new Locale("pt", "BR"); // para $dollar ("en", "US")
		Currency currency = Currency.getInstance(locale);
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);

		double value = 148.97;
		System.out.printf("Total in %s: %s%n", currency.getDisplayName(),
				currencyFormat.format(value));
	}
}
