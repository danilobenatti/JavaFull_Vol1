package cap04_Strings_Arrays;

/**
 * UsandoStringBuffer.java - pg.78
 *
 * @author danil
 *
 */
public class UsandoStringBuffer {
	
	public static void main(String[] args) {
		
		String nomeString = "Romuel";
		nomeString = nomeString + " Dias de Oliveira";
		
		System.out.println(nomeString);
		
		StringBuffer nomeStringBuffer = new StringBuffer("Andrea Paula");
		nomeStringBuffer.append(" dos Reis Santos Oliveira");
		
		System.out.println(nomeStringBuffer);
	}
}