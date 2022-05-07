package cap06_Static_Exceptions;

/**
 * FormasGeometricas.java
 * 
 * @author danil
 *
 */
public class FormasGeometricas {
	
	public static int qtd;
	
	private String nome;
	
	private String cor;
	
	private int zoom;
	
	public FormasGeometricas() {
		qtd++;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setZoom(int zoom) {
		this.zoom = zoom;
	}
	
	public void exibir() {
		System.out.printf(
				"\nDesenhando um: %s,\nDe cor: %s,\nAmpliando sua exibição em %s%%.\n",
				this.nome, this.cor, this.zoom);
	}
	
}
