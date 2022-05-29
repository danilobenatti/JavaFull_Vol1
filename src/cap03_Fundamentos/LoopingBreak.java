package cap03_Fundamentos;

/**
 * Exemplo de código no estudo de loops Oracle Mylearn.
 * 
 * @author danil
 */
public class LoopingBreak {

	public static void main(String[] args) {

		var passmark = 13;
		var score = 0;
		var passed = false;
		int[] scores = { 4, 6, 2, 8, 12, 35, 9 };
		for (var iterableScore : scores) {
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
