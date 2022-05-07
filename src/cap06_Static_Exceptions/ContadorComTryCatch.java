package cap06_Static_Exceptions;

/**
 * ContadorComTryCatch.java
 * 
 * @author danil
 *
 */
public class ContadorComTryCatch {
	
	public static void main(String[] args) {
		try {
			int max = Integer.parseInt(args[0]);
			for (int i = 1; i < max; i++) {
				System.out.print(" " + i);
			}
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Informe o limite da contagem!");
		} catch (NumberFormatException e2) {
			System.out.println("Informe um número inteiro!");
		}
	}
}
