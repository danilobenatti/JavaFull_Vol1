package cap05_POO;

/**
 * AtletaModernojava - pg.98
 *
 * @author danil
 *
 */
public class AtletaModerno extends Pessoa implements Estudar {
	
	private String esporte;
	
	public AtletaModerno(String nome, int idade, String esporte) {
		super(nome, idade);
		this.setEsporte(esporte);
	}
	
	public String getEsporte() {
		return esporte;
	}
	
	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}
	
	public void play() {
		System.out.println("Praticar " + esporte);
	}
	
	@Override
	public void comer() {
		System.out.println("Comer proteínas e carboidratos!");
	}
	
	@Override
	public void ler(String objetoLeitura) {
		System.out.println("Lendo: " + objetoLeitura);
	}
	
	@Override
	public void escrever(String objetoEscrita) {
		System.out.println("Escrevendo: " + objetoEscrita);
	}
}
