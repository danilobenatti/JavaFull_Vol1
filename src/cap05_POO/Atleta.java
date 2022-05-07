package cap05_POO;

/**
 * Atleta.java - pg.94
 *
 * @author danil
 *
 */
public class Atleta extends Pessoa {
	
	private String esporte;
	
	public Atleta(String nome, int idade, String esporte) {
		super(nome, idade);
		this.esporte = esporte;
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
		System.out.println("Comer arros e feijão!");
	}
}
