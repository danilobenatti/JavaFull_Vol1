package cap04_Strings_Arrays;

/**
 * ConvertendoString.java - pg.78
 *
 * @author danil
 *
 */
public class ConvertendoString {
	
	public static void main(String[] args) {
		
		int dez = 10;
		double umEMeio = 1.5;
		
		String textoInteiro = String.valueOf(dez);
		String textoDouble = String.valueOf(umEMeio);
		
		int valorInteiro = Integer.parseInt(textoInteiro);
		double valorDouble = Double.parseDouble(textoDouble);
		
		valorDouble = 1234.0 + valorDouble;
		
		System.out.printf("Valor INTEIRO é: %d\nValor DOUBLE é: %,3.2f", valorInteiro,
				valorDouble);
	}
}