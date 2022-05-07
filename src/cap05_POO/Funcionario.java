package cap05_POO;

/**
 * Funcionario.java - pg.100
 *
 * @author danil
 *
 */
public abstract class Funcionario {
	
	private int horasTrabalhadas;
	
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		if (horasTrabalhadas < 0) {
			this.horasTrabalhadas = 0;
		} else {
			this.horasTrabalhadas = horasTrabalhadas;
		}
	}
	
	/**
	 * Método informeHoras deve ser implementado.
	 *
	 * @param horasTrabalhadas
	 */
	public abstract void infomeHoras(int horasTrabalhadas);
	
}
