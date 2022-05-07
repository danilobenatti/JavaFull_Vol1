package cap04_Strings_Arrays;

/**
 * InicializandoVetores.java - pg.82
 *
 * @author danil
 *
 */
public class InicializandoVetores {
	
	public static void main(String[] args) {
		
		final int TAMANHO_VETOR = 4;
		String nomes[] = { "Pedro", "João", "Marcos", "Matheus" };
		String clientes[] = new String[TAMANHO_VETOR];
		
		// Inicializamos o vetor clientes de forma manual
		for (int i = 0; i < TAMANHO_VETOR; i++) {
			clientes[i] = i + " - " + nomes[i];
		}
		
		// Exibindo o vetor de clientes com os nomes
		System.out.println("Relatório de clientes cadastrados:");
		for (int i = 0; i < TAMANHO_VETOR; i++) {
			System.out.println(clientes[i]);
		}
	}
}
