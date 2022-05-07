package cap04_Strings_Arrays;

/**
 * ComparandoString.java - pg.77
 *
 * @author danil
 *
 */
public class ComparandoString {
	
	public static void main(String[] args) {
		String usuario = "Romuel";
		String senha = "123ABC";
		
		System.out.println("\n=== Simples ===\n");
		
		if (usuario == "Romuel" && senha == "123abc") {
			System.out.println("Acesso Permitido.");
		} else {
			System.out.println("Acesso Negado!");
		}
		
		System.out.println("\n=== equals() ===\n");
		
		if (usuario.equals("Romuel") && senha.equals("123abc")) {
			System.out.println("Acesso Permitido.");
		} else {
			System.out.println("Acesso Negado!");
		}
		
		System.out.println("\n=== equalsIgnoreCase() ===\n");
		
		if (usuario.equalsIgnoreCase("romuel") && senha.equalsIgnoreCase("123abc")) {
			System.out.println("Acesso Permitido.");
		} else {
			System.out.println("Acesso Negado!");
		}
	}
}