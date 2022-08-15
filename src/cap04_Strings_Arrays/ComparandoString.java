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
		
		var nome1 = "João";
		var nome2 = "João";
		var nome3 = new String("João");
		var igual1 = nome1 == nome2 ? "sim" : "não";
		System.out.println("1) Os nomes são iguais? " + igual1);
		var igual2 = nome1 == nome3 ? "sim" : "não";
		System.out.println("2) Os nomes são iguais? " + igual2);
		var igual3 = nome1.equals(nome3) ? "sim" : "não";
		System.out.println("3) Os nomes são iguais? " + igual3);
	}
}