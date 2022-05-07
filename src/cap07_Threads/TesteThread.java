package cap07_Threads;

public class TesteThread {
	
	public static void main(String[] args) {
		
		NovaThread novaThread1 = new NovaThread("Sonic");
		NovaThread novaThread2 = new NovaThread("Papaléguas");
		
		System.out.println("Dada a partida da corrida de threads.");
		novaThread1.start();
		novaThread2.start();
		
		try {
			novaThread1.join();
			novaThread2.join();
		} catch (InterruptedException e) {
		}
		System.out.println("Fim da corrida de threads.");
	}
}
