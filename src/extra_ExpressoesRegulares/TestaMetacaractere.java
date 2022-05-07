package extra_ExpressoesRegulares;

public class TestaMetacaractere {
	
	public static void main(String[] args) {
		/**
		 * validações de ocorrências através dos metacaracteres.
		 * 
		 * @param Validações de caracteres
		 */
		boolean email = "@".matches(".");
		System.out.println("Qualquer caractere: " + email);
		
		boolean numero = "a".matches("\\d");
		System.out.println("Possui número: " + numero);
		
		numero = "2".matches("\\d");
		System.out.println("Possui número? " + numero);
		
		numero = "2a".matches("\\d");
		System.out.println("Possui número? " + numero);
		
		boolean letrasNumeros = "2a".matches("\\d\\w");
		System.out.println("Possui letras e números? " + letrasNumeros);
		
		boolean espaco = "  ".matches("\\s\\s");
		System.out.println("Possui 2(dois) espaço? " + espaco);
	}
	
}
