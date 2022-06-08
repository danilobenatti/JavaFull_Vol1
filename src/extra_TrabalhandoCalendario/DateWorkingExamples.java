package extra_TrabalhandoCalendario;

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
		System.out.println(dateStr);

		// Format Date Into StringBuffer
		StringBuffer stringBuffer = new StringBuffer();
		Date now = new Date();
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss Z z");
		System.out.println(simpleDateFormat2.format(now, stringBuffer,
				new FieldPosition(0)));

		// Parsing Dates
		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date dateObj = simpleDateFormat3.parse("2022-05-29");
			System.out.println(dateObj);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// Creating a SimpleDateFormat For a Specific Locale
		String pattern = "EEEEE dd MMMMM yyyy HH:mm:ss.SSS Z z";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern,
				new Locale("pt", "BR"));
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
	}
}
