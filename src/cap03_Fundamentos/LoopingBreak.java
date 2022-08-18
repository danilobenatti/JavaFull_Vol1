package cap03_Fundamentos;

/**
 * Exemplo de código no estudo de loops Oracle Mylearn.
 * 
 * @author danil
 */
public class LoopingBreak {

	public static void main(String[] args) {

		int passmark = 13;
		int score = 0;
		boolean passed = false;
		int[] scores = { 4, 6, 2, 8, 12, 35, 9 };
		for (int iterableScore : scores) {
			score = iterableScore;
			if (iterableScore >= passmark) {
				passed = true;
				break;
			}
			System.out.println("score: " + iterableScore);
		}
		System.out.println(
				"At least one passed? " + passed + ", score is " + score);
	}
}
