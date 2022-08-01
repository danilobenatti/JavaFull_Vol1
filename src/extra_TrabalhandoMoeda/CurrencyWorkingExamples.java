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
		
		Currency c1 = Currency.getInstance(localeBr);
		Currency c2 = Currency.getInstance(localeUs);
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(localeBr);
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(localeUs);
		
		double value = 1480.97;
		System.out.printf("%s: %s%n", c1.getDisplayName(),
				nf1.format(value));
		System.out.printf("%s: %s%n", c2.getDisplayName(),
				nf2.format(value));
	}
	
}
