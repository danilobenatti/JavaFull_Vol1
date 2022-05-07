package cap03_Fundamentos;

/**
 * ExemploSwitch.java - pg.69
 *
 * @author danil
 *
 */
public class ExemploSwitch {
	
	public static void main(String[] args) {
		
		char[] vogais = { 'a', 'e', 'i', 'o', 'u' };
		
		switch (vogais[1]) {
			case 'a':
			case 'A':
				System.out.println("Vogal A.");
				break;
			case 'e':
			case 'E':
				System.out.println("Vogal E.");
				break;
			case 'i':
			case 'I':
				System.out.println("Vogal I.");
				break;
			case 'o':
			case 'O':
				System.out.println("Vogal O.");
				break;
			case 'u':
			case 'U':
				System.out.println("Vogal U.");
				break;
		}
	}
}