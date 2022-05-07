package cap04_Strings_Arrays;

/**
 * UsandoArrayMultidimensional2.java - pg.86
 *
 * @author danil
 *
 */
public class UsandoArrayMultidimensional2 {
	
	public static void main(String[] args) {
		
		final int QTD_LINHAS = 4, QTD_COLUNAS = 2;
		String alunosNotas[][] = { 
				{ "Paulo", Double.toString(10.0) },
				{ "Matias", Double.toString(6.0) },
				{ "Bernabe", Double.toString(9.0) },
				{ "Madelena", Double.toString(9.5) }
			};
		
		System.out.printf("| %8s| %8s|\n", "Alunos", "Notas");
		for (int i = 0; i < QTD_LINHAS; i++) {
			for (int j = 0; j < QTD_COLUNAS; j++) {
				System.out.printf("| %8s", alunosNotas[i][j]);
			}
			System.out.printf("|\n");
		}
	}
}
