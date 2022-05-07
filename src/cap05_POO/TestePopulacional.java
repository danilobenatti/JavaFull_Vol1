package cap05_POO;

/**
 * TestePopulacional.java - pg.97
 *
 * @author danil
 *
 */
public class TestePopulacional {
	
	public static void main(String[] args) {
		Pessoa homem = new Pessoa("Romuel", 40);
		Pessoa mulher = new Pessoa("Andrea", 30);
		Atleta judoca = new Atleta("Aurélio Miguel", 28, "judô");
		Atleta tenista = new Atleta("Guga", 25, "tênis");
		
		AtletaModerno ciclista = new AtletaModerno("Henrique Avancini", 33,
				"montain byke");
		
		homem.acordar();
		mulher.comer();
		
		judoca.play();
		judoca.comer();
		tenista.play();
		System.out.printf("O atleta %s têm %d anos.\n", tenista.getNome(),
				tenista.getIdade());
		tenista.comer();
		
		ciclista.play();
		ciclista.ler("Revistas e Jornais.");
		ciclista.escrever("Matérias no jornal sobre ciclismo ecológico.");
	}
}
