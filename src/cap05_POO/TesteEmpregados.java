package cap05_POO;

/**
 * TesteEmpregados.java
 *
 * @author danil
 *
 */
public class TesteEmpregados {
	
	public static void main(String[] args) {
		
		Seguranca sergio = new Seguranca();
		Gerente pedro = new Gerente();
		
		System.out.printf("Sérgio(%s): %d\n", sergio.getClass().getSimpleName(),
				sergio.getHorasTrabalhadas());
		System.out.printf("Pedro(%s): %d\n", pedro.getClass().getSimpleName(),
				pedro.getHorasTrabalhadas());
		
		System.out.println("=== Alterado ===");
		
		// Acessando um método público comum
		pedro.setHorasTrabalhadas(-5);
		System.out.printf("Pedro(%s) alterado: %d\n", pedro.getClass().getSimpleName(),
				pedro.getHorasTrabalhadas());
		
		// Acessando um método público abstrato
		sergio.setHorasTrabalhadas(12);
		System.out.printf("Sérgio(%s) alterado: %d\n", sergio.getClass().getSimpleName(),
				sergio.getHorasTrabalhadas());
	}
}
