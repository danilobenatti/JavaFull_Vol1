package extra_TrabalhandoCalendario;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class DateWorkingExamples {
	
	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(new Date().getTime());
		
		Locale[] availableLocales = Locale.getAvailableLocales();
		System.out.println(availableLocales);
		
		String[] availableIDs = TimeZone.getAvailableIDs();
		System.out.println(availableIDs);
		
		Locale localeBr = new Locale("pt", "BR");
		Locale localeUs = new Locale("en", "US");
		TimeZone timeZone = TimeZone.getTimeZone("America/Sao_Paulo");
		
		Date calendar1 = Calendar.getInstance(timeZone, localeBr).getTime();
		System.out.println("Ex.1: " + calendar1);
		
		TimeZone tz1 = new SimpleTimeZone(Calendar.ZONE_OFFSET, "GMT-03:00");
		Calendar calendar2 = Calendar.getInstance(tz1, localeBr);
		System.out.println("Ex.2: " + calendar2.getTime());
		
		TimeZone.setDefault(timeZone);
		Calendar calendar3 = Calendar.getInstance(timeZone, localeBr);
		System.out.println("Ex.3: " + calendar3.getTime());
		
		// Creating a SimpleDateFormat
		SimpleDateFormat spf1 = new SimpleDateFormat("dd-MM-yyyy");
		// Formatting Dates
		String dateStr = spf1.format(now);
		System.out.println("Creating a SimpleDateFormat: " + dateStr);
		
		// Format Date Into StringBuffer
		StringBuffer buffer = new StringBuffer();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z z");
		StringBuffer date1 = sdf2.format(now, buffer, new FieldPosition(0));
		System.out.println("Format Date Into StringBuffer: " + date1);
		
		// Parsing Dates
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			Date dateObj = sdf3.parse("2022-05-29 22:30");
			System.out.println("Parsing Dates:  " + dateObj);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		// Creating a SimpleDateFormat For a Specific Locale
		String pattern = "EEEEE dd MMMMM yyyy HH:mm:ss.SSS Z z";
		SimpleDateFormat sdf4 = new SimpleDateFormat(pattern, localeBr);
		String date2 = sdf4.format(now);
		System.out.println("SimpleDateFormat for Specific Locale: " + date2);
		
		// Date and DateFormat
		DateFormat format = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Date and DateFormat[short]: " + format.format(now));
		System.out.println("Date and DateFormat[medium]: "
				+ DateFormat.getDateInstance(DateFormat.MEDIUM).format(now));
		System.out.println("Date and DateFormat[long]: "
				+ DateFormat.getDateInstance(DateFormat.LONG).format(now));
		
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeBr);
		System.out.println("Date and DateFormat[full_BR]: " + df1.format(now));
		
		DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.SHORT,
				DateFormat.SHORT, localeBr);
		System.out.println("DateFormat[short_BR]: " + df2.format(now));
		
		DateFormat df3 = DateFormat.getDateTimeInstance(DateFormat.SHORT,
				DateFormat.MEDIUM, localeBr);
		System.out.println("DateFormat[short/medium_BR]: " + df3.format(now));
		
		System.out.println("DateFormat[full_US]: " + DateFormat
				.getDateInstance(DateFormat.FULL, localeUs).format(now));
	}
}
