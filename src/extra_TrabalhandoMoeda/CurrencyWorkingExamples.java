package extra_TrabalhandoMoeda;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyWorkingExamples {

	public static void main(String[] args) {

		System.out.println(Locale.getDefault());
		System.out.println(Locale.getDefault().getDisplayName());
		System.out.println(Locale.getDefault(Locale.Category.DISPLAY));
		System.out.println(Locale.getDefault(Locale.Category.FORMAT));

		Locale localeBr = new Locale("pt", "BR");
		Locale localeUs = new Locale("en", "US");

		Currency currency1 = Currency.getInstance(localeBr);
		Currency currency2 = Currency.getInstance(localeUs);
		NumberFormat currencyFormat1 = NumberFormat
				.getCurrencyInstance(localeBr);
		NumberFormat currencyFormat2 = NumberFormat
				.getCurrencyInstance(localeUs);

		double value = 1480.97;
		System.out.printf("Total in %s: %s%n", currency1.getDisplayName(),
				currencyFormat1.format(value));
		System.out.printf("Total in %s: %s%n", currency2.getDisplayName(),
				currencyFormat2.format(value));
	}

}
