package cap04_Strings_Arrays;

/**
 * UsandoArrayMultidimensional.java - pg.85
 *
 * @author danil
 *
 */
public class UsandoArrayMultidimensional {
	
	public static void main(String[] args) {
		
		final int QTD_LINHAS = 4;
		final int QTD_COLUNAS = 2;
		String[][] alunosNotas = new String[QTD_LINHAS][QTD_COLUNAS];
		
		String[] alunos = { "Paulo", "Matias", "Benabe", "Esdalena" };
		Double[] notas = { 10.0, 6.0, 9.0, 9.5 };
		
		// Primeiro Aluno
		alunosNotas[0][0] = alunos[0];
		alunosNotas[0][1] = String.valueOf(notas[0]);
		
		// Segundo Aluno
		alunosNotas[1][0] = alunos[1];
		alunosNotas[1][1] = String.valueOf(notas[1]);
		
		// Terceiro Aluno
		alunosNotas[2][0] = alunos[2];
		alunosNotas[2][1] = String.valueOf(notas[2]);
		
		// Quarto Aluno
		alunosNotas[3][0] = alunos[3];
		alunosNotas[3][1] = String.valueOf(notas[3]);
		
		System.out.printf("| %8s| %8s|%n", "Alunos", "Notas");
		for (int i = 0; i < QTD_LINHAS; i++) {
			for (int j = 0; j < QTD_COLUNAS; j++) {
				System.out.printf("| %8s", alunosNotas[i][j]);
			}
			System.out.printf("|%n");
		}
	}
}
