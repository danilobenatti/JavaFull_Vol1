package extra_TrabalhandoCalendario;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateWorkingExamples {

	public static void main(String[] args) {

		// Creating a SimpleDateFormat
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd-MM-yyyy");
		// Formatting Dates
		String dateStr = simpleDateFormat1.format(new Date());
		System.out.println("Creating a SimpleDateFormat: " + dateStr);

		// Format Date Into StringBuffer
		StringBuffer stringBuffer = new StringBuffer();
		Date now = new Date();
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss Z z");
		System.out.println("Format Date Into StringBuffer: " + simpleDateFormat2
				.format(now, stringBuffer, new FieldPosition(0)));

		// Parsing Dates
		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			Date dateObj = simpleDateFormat3.parse("2022-05-29 22:30");
			System.out.println("Parsing Dates:  " + dateObj);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// Creating a SimpleDateFormat For a Specific Locale
		String pattern = "EEEEE dd MMMMM yyyy HH:mm:ss.SSS Z z";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern,
				new Locale("pt", "BR"));
		String date = simpleDateFormat.format(new Date());
		System.out.println(
				"Creating a SimpleDateFormat For a Specific Locale: " + date);

		// Date and DateFormat
		DateFormat format = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(
				"Date and DateFormat[short]: " + format.format(new Date()));
		System.out.println("Date and DateFormat[medium]: " + DateFormat
				.getDateInstance(DateFormat.MEDIUM).format(new Date()));
		System.out.println("Date and DateFormat[long]: " + DateFormat
				.getDateInstance(DateFormat.LONG).format(new Date()));
	}
}
