package cap03_Fundamentos;

/**
 * ExemploIf.java - pg.67
 *
 * @author danil
 *
 */
public class ExemploIf {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		if (5 > 0) {
			System.out.println("5 é maior que 0!");
		}
		if (5 < 0) {
			System.out.println("Tem certeza que 0 é maior que 5?");
		}
		
		System.out.println("=== # ===");
		
		if (5 > 0) {
			System.out.println("5 é maior que 0!");
		} else {
			System.out.println("Tem certeza que 0 é maior que 5?");
		}
		
		System.out.println("=== # ===");
		
		if (5 > 0) {
			System.out.println("5 é maior que 0!");
		} else if (5 < 0) {
			System.out.println("Tem certeza que 0 é maior que 5?");
		} else {
			System.out.println("Tem certeza que 0 é igual que 5?");
		}
	}
}