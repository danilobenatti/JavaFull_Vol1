package cap05_POO;

/**
 * Seguranca.java - pg.101
 *
 * @author danil
 *
 */
public class Seguranca extends Funcionario {
	
	public Seguranca() {
		super.setHorasTrabalhadas(8);
	}
	
	/**
	 * implementação do método abstrato informeHoras() da classe funcionário
	 */
	@Override
	public void infomeHoras(int horasTrabalhadas) {
		super.setHorasTrabalhadas(horasTrabalhadas);
	}
}
