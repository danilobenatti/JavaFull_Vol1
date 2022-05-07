package cap04_Strings_Arrays;

/**
 * OperacoesString.java - pg.76
 *
 * @author danil
 *
 */
public class OperacoesString {
	
	public static void main(String[] args) {
		
		System.out.println("--- Manipulando String ---");
		
		String texto = "Estudo Java desde o início!    Era 1991    ";
		int tamanhoTexto = texto.length();
		char quintoCaracter = texto.charAt(7);
		String palavraJava = texto.substring(7, 11);
		String textoMaiusculo = texto.toUpperCase();
		String textoMinusculo = texto.toLowerCase();
		String textoSemEspaco = texto.substring(27, 42).trim();
		int posicaoLetraJ = texto.indexOf("J");
		int ultimaPosicaoLetraA = texto.lastIndexOf("a");
		
		System.out.printf(
				"Texto: %s\nTamanho do texto: %d\nQuinto caracter: %s\nSomente a palavar 'Java': %s\n"
						+ "Texto em maiúsculo: %s\nTexto em minúsculo: %s\n"
						+ "Texto sem espacos: %s\nPosição da letra 'J': %d\n"
						+ "Última ocorrência da letra 'a': %d\n.",
				texto, tamanhoTexto, quintoCaracter, palavraJava, textoMaiusculo,
				textoMinusculo, textoSemEspaco, posicaoLetraJ, ultimaPosicaoLetraA);
	}
}