package extra_ExpressoesRegulares;

public class TestaOcorrencias {
	public static void main(String[] args) {
		/**
		 * validações de ocorrências através dos metacaracteres.
		 * 
		 * @title Exemplos de ocorrências
		 * @file metacaracteres.txt
		 */
		// Procura a ocorrencia de 1 caractere
		boolean caractere = "E".matches(".");
		System.out.println(caractere);
		
		// Procura a ocorrência de 2 caracteres
		caractere = "Ab".matches("..");
		System.out.println(caractere);
		
		// Valida formato de CEP
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		boolean valida = "99855-000".matches(cep);
		System.out.println(valida);
	}
}
