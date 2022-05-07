package cap08_Arquivos;

/**
 * TestaSerializaObjeto.java
 * 
 * @author danil
 *
 */
public class TestaSerializaObjeto {
	
	public static void main(String[] args) {
		Modelo romuel = new Modelo();
		romuel.setId(1);
		romuel.setNome("Romuel");
		romuel.setValor(1350.32);
		
		Modelo andrea = new Modelo(2, "Andrea", 1256.67);
		Modelo karen = new Modelo(3, "Karen", 1789.45);
		Modelo julia = new Modelo(4, "Júlia", 2100.00);
		
		SerializaObjeto funcionario = new SerializaObjeto("funcionarios.ser");
		funcionario.gerarArquivo();
		funcionario.adicionarRegistro(romuel);
		funcionario.adicionarRegistro(andrea);
		funcionario.adicionarRegistro(karen);
		funcionario.adicionarRegistro(julia);
		funcionario.fecharArquivo();
		
		funcionario.abrirArquivo();
		funcionario.listarRegistros();
		funcionario.fecharArquivo();
	}
	
}
