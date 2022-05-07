package cap05_POO;

/**
 * Gerente.java
 *
 * @author danil
 *
 */
public class Gerente extends Funcionario {
	
	public Gerente() {
		super.setHorasTrabalhadas(8);
	}
	
	@Override
	public void infomeHoras(int horasTrabalhadas) {
		super.setHorasTrabalhadas(horasTrabalhadas);
	}
	
}
