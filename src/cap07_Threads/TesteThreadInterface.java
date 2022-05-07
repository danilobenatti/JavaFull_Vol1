package cap07_Threads;

/**
 * TesteThreadInterface.java
 * 
 * @author danil
 *
 */
public class TesteThreadInterface {
	
	public static void main(String[] args) {
		
		NovaThreadInterface threadInterface1 = new NovaThreadInterface("Sonic");
		NovaThreadInterface threadInterface2 = new NovaThreadInterface("Papaléguas");
		
		Thread sonic = new Thread(threadInterface1);
		Thread papaleguas = new Thread(threadInterface2);
		
		sonic.start();
		papaleguas.start();
		
		try {
			sonic.join();
			papaleguas.join();
		} catch (InterruptedException e) {
		}
	}
}
