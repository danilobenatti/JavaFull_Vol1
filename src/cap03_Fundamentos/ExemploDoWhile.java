package cap03_Fundamentos;

/**
 * ExemploDoWhile.java - pg.71
 *
 * @author danil
 *
 */
public class ExemploDoWhile {
	
	public static void main(String[] args) {
		
		int min = 1, max = 10;
		do {
			System.out.println("" + min + " < " + max);
			min++;
			max--;
		} while (min < max);
		System.out.println("" + min + " < " + max + "condição inválida.");
	}
}