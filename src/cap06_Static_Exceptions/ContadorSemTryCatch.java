package cap06_Static_Exceptions;

/**
 * ContadorSemTryCatch.java
 * 
 * @author danil
 *
 */
public class ContadorSemTryCatch {
	
	public static void main(String[] args) {
		
		int total = args.length;
		if (total > 0) {
			int max = Integer.parseInt(args[0]);
			for (int i = 0; i < max; i++) {
				System.out.print(" " + i);
			}
		} else {
			System.out.println("Por favor informe o limite da contagem!");
		}
	}
}
