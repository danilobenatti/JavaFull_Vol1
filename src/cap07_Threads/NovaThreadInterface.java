package cap07_Threads;

/**
 * NovaThreadInterface.java
 * 
 * @author danil
 *
 */
public class NovaThreadInterface implements Runnable {
	
	public String nome;
	
	public NovaThreadInterface(String nome) {
		this.nome = nome;
	}
	
	public void run() {
		
		for (int i = 1; i <= 3; i++) {
			System.out.printf("%s completou a etapa %d.\n", nome, (i));
		}
		
	}
	
}
