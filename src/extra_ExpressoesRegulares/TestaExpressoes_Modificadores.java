package extra_ExpressoesRegulares;

public class TestaExpressoes_Modificadores {
	
	public static void main(String[] args) {
		
		/**
		 * Modificadores Um modificador é um caractere adicionado depois de um
		 * delimitador final, onde acaba mudando o jeito como a função irá tratar a
		 * expressão. Abaixo estão relacionados os modificadores que podem ser usados:
		 * 
		 * @param (?i) Ignora maiúsculas de minúsculas.
		 * @param (?m) Trabalha com multilinhas.
		 * @param (?s) Faz com que o caractere encontre novas linhas.
		 * @param (?x) Permite inclusão de espaços e comentários.
		 */
		boolean sobreNome = "Silveira".matches("(?i)silvEira");
		System.out.println("Retorno = " + sobreNome);
	}
}
