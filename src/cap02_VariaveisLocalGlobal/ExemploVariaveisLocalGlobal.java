package cap02_VariaveisLocalGlobal;

public class ExemploVariaveisLocalGlobal {
	
	static int maiorIdadeFiscal = 21;
	
	public static void main(String[] args) {
		
		int idadePenal = 18;
		seraEncarcerado(idadePenal, 16);
		seraEncarcerado(idadePenal, 17);
		seraEncarcerado(idadePenal, 18);
		seraEncarcerado(idadePenal, 19);
		seraEncarcerado(idadePenal, 20);
		seraEncarcerado(idadePenal, 21);
		seraEncarcerado(idadePenal, 22);
	}
	
	private static void seraEncarcerado(int maiorIdadePenal, int idadeAtual) {
		if (idadeAtual >= maiorIdadeFiscal) {
			System.out.println("Cidadão vai para cadeia! :(");
		} else if (idadeAtual >= maiorIdadePenal) {
			System.out.println("Cidadão vai para febem! :o");
		} else {
			System.out.println("Cidadão vai para casa! :)");
		}
	}
}
