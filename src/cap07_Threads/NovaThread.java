package cap07_Threads;

/**
 * NovaThread.java
 * 
 * @author danil
 *
 */
public class NovaThread extends Thread {
	
	public NovaThread(String nome) {
		super(nome);
	}
	
	public void run() {
		System.out.println("Partida de: " + getName());
		try {
			sleep((long) (Math.random() * 1000));
		} catch (InterruptedException e) {
		}
		System.out.println("Chegada de: " + getName());
	}
}
