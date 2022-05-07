package cap04_Strings_Arrays;

/**
 * AlocandoVetores.java - pg.81
 *
 * @author danil
 *
 */
public class AlocandoVetores {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		final int TAMANHO_VETOR = 5;
		
		int vetorInteiro[];
		vetorInteiro = new int[10];
		
		char vetorChar[] = new char[TAMANHO_VETOR];
		
		boolean[] vetorBoolean = new boolean[10];
		
		String[] vetorStringWrapper = { "primeiro", "segundo", "terceiro", "quarto" };
		
		Integer vetorIntegerWrapper[] = new Integer[2];
		
		@SuppressWarnings("deprecation")
		Boolean vetorBooleanWrapper[] = { new Boolean(true), new Boolean(false) };
	}
}
