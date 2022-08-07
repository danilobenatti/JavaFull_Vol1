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
		String format1 = nf1.format(value);
		System.out.printf("%s[%s]: %s%n", c1.getDisplayName(),
				c1.getSymbol(localeBr), format1);
		String format2 = nf2.format(value);
		System.out.printf("%s[%s]: %s%n", c2.getDisplayName(),
				c2.getSymbol(localeUs), format2);
		
		System.out.println(noCurrencySymbol(format1, localeBr));
		System.out.println(noCurrencySymbol(format2, localeUs));
		
	}
	
	public static String noCurrencySymbol(String valor, Locale locale) {
		String symbol = Currency.getInstance(locale).getSymbol();
		return valor.replace(symbol, "").trim();
	}
	
}
