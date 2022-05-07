package cap06_Static_Exceptions;

/**
 * Switche.java
 * 
 * @author danil
 *
 */
public class Switche {
	
	private static int qtdSwitche;
	
	@SuppressWarnings("unused")
	private static int ligar;
	@SuppressWarnings("unused")
	private static int desligar;
	
	public Switche() {
		Switche.qtdSwitche++;
	}
	
	public static void apertarBotao(int botao) {
		switch (botao) {
			case 0:
				desligar++;
				break;
			case 1:
				ligar++;
				break;
			default:
				break;
		}
	}
	
	public int getQtdSwitche() {
		return Switche.qtdSwitche;
	}
	
}
