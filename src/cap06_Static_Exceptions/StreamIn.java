package cap06_Static_Exceptions;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * StreamIn.java
 * 
 * @author danil
 *
 */
public final class StreamIn {
	
	private static BufferedReader bufferedReader;
	private static String string;
	
	public static double lerDouble() {
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			string = bufferedReader.readLine();
			return Double.parseDouble(string);
		} catch (IOException e) {
			return 0;
		} catch (NumberFormatException e) {
			return 0;
		}
	}
	
	public static int lerInteger() {
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			string = bufferedReader.readLine();
			return Integer.parseInt(string);
		} catch (IOException e) {
			return 0;
		} catch (NumberFormatException e) {
			return 0;
		}
	}
	
	public static String lerString() {
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			string = bufferedReader.readLine();
			return string;
		} catch (IOException e) {
			return "";
		}
	}
}
