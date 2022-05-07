package cap05_POO;

/**
 * Pessoa.java - pg.89
 *
 * @author danil
 *
 */
public class Pessoa {
	
	private String nome;
	
	private int idade;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void acordar() {
		System.out.println("uhaaa, Bom dia!");
	}
	
	public void comer() {
		System.out.println("Comer macarrão!");
	}
	
	public void dormir() {
		System.out.println("ZzZzzZZzzZZZ");
	}
}
