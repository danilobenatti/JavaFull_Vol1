package extra_ExpressoesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExempleSearchW3schools {
	/**
	 * Pattern Class - Defines a pattern (to be used in a search) Matcher Class
	 * - Used to search for the pattern PatternSyntaxException Class - Indicates
	 * syntax error in a regular expression pattern
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String regex = "w3school";
		int flags = Pattern.CASE_INSENSITIVE;
		Pattern pattern = Pattern.compile(regex, flags);
		Matcher matcher = pattern.matcher("Visit W3Schools!");
		System.out.println(matcher.find() ? "Match found" : "Match not found");
	}
}
