package cap04_Strings_Arrays;

import java.util.Arrays;

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
		
		int[] vetorInteiro;
		vetorInteiro = new int[10];
		
		char[] vetorChar = new char[TAMANHO_VETOR];
		
		boolean[] vetorBoolean = new boolean[10];
		
		String[] vetorStringWrapper = { "primeiro", "segundo", "terceiro",
				"quarto" };
		
		Integer[] vetorIntegerWrapper = new Integer[2];
		
		Boolean[] vetorBooleanWrapper = { new Boolean(true),
				new Boolean(false) };
		
		int[] m = new int[5];
		m[0] = 5;
		m[1] = 4;
		m[2] = 3;
		m[3] = 2;
		m[4] = 1;
		System.out.println("m = " + Arrays.toString(m));
		System.out.println(m.length);
		
		int[] n = { 0, 1, 2, 3, 4, 5, 6 };
		System.out.println("n = " + Arrays.toString(n));
		System.out.println(n.length);
		
		int[] vectorExample1 = { 0, 1, 2, 3, 4 };
		System.out.println("o = " + Arrays.toString(vectorExample1));
		System.out.println(vectorExample1.length);
		for (int i = 0; i < vectorExample1.length; i++) {
			System.out.print(vectorExample1[i] + " ");
			if (i == vectorExample1.length - 1) {
				System.out.printf("fim%n");
			}
		}
		int[] vectorExample3 = { 4, 2, 0, 3, 1 };
		Arrays.sort(vectorExample3);
		for (int value : vectorExample3) {
			System.out.print(value + " ");
		}
		
		char[] vectorExample4 = { 'h', 'j', 'a', 'f', 'w' };
		Arrays.sort(vectorExample4);
		for (char value : vectorExample4) {
			System.out.print(value + " ");
		}
		int binarySearch = Arrays.binarySearch(vectorExample4, 'f');
		System.out.printf("%nA palavra 'f' está na posição %d%n", binarySearch);
	}
}
