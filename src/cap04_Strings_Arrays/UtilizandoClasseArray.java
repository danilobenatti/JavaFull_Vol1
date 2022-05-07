package cap04_Strings_Arrays;

import java.util.Arrays;

/**
 * UtilizandoClasseArray.java - pg.83
 *
 * @author danil
 *
 */
public class UtilizandoClasseArray {
	
	public static void main(String[] args) {
		
		final int ITENS = 4;
		double[] salarioBase = { 1100.5, 1220.53, 1178.05, 1800.0 };
		String[] cargosDescricao = { "Servente", "Cozinheiro", "Barman", "Gerente" };
		
		System.out.printf("\nFolha de Pagamento:\n|id.| %12s | %11s |\n", "Cargo",
				"Salário");
		
		for (int i = 0; i < ITENS; i++) {
			System.out.printf("| %d | %12s | R$ %,3.2f |\n", i, cargosDescricao[i],
					salarioBase[i]);
		}
		
		double[] vetorDeMil = new double[ITENS];
		Arrays.fill(vetorDeMil, 1000.0);
		
		if (Arrays.equals(salarioBase, vetorDeMil)) {
			Arrays.sort(salarioBase);
		} else {
			Arrays.sort(cargosDescricao);
		}
		
		int indice = Arrays.binarySearch(salarioBase, 1800.0);
		System.out.printf(
				"\nFuncionário Selecionado\n|id.| %12s | %11s |\n| %d | %12s | R$ %,3.2f |\n",
				"Cargo", "Salário", indice, cargosDescricao[indice], salarioBase[indice]);
	}
}
