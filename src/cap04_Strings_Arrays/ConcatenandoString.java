package cap04_Strings_Arrays;

/**
 * ConcatenandoString.java - pg.74
 *
 * @author danil
 *
 */
public class ConcatenandoString {
	
	public static void main(String[] args) {
		
		String nome1 = "Romuel", sobreNome1 = "Dias de Oliveira";
		String nomeCompleto1 = nome1 + " " + sobreNome1;
		System.out.println(nomeCompleto1);
		
		System.out.println("--- # ---");
		
		String nome2 = new String("Romuel");
		String sobreNome2 = new String(" Dias de Oliveira");
		String nomeCompleto2 = nome2.concat(sobreNome2);
		System.out.println(nomeCompleto2);
	}
}