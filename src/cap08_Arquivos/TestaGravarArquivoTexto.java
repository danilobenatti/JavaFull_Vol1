package cap08_Arquivos;

/**
 * TestaGravarArquivoTexto.java
 * 
 * @author danil
 *
 */
public class TestaGravarArquivoTexto {
	
	public static void main(String[] args) {
		
		GravarArquivoTexto funcionarios = new GravarArquivoTexto("funcionarios.txt");
		funcionarios.gerarArquivo();
		funcionarios.adicionarRegistro(1, "João", 1200.23);
		funcionarios.adicionarRegistro(2, "Paulo", 1130.23);
		funcionarios.adicionarRegistro(3, "José", 1280.70);
		funcionarios.adicionarRegistro(4, "Maria", 2201.44);
		funcionarios.fecharArquivo();
		
		GravarArquivoTexto produtos = new GravarArquivoTexto("produtos.txt");
		produtos.gerarArquivo();
		produtos.adicionarRegistro(1, "Arroz", 2.89);
		produtos.adicionarRegistro(2, "Feijão", 4.99);
		produtos.adicionarRegistro(3, "Macarrão", 1.74);
		produtos.adicionarRegistro(4, "Farinha", 3.00);
		produtos.adicionarRegistro(5, "Sal", 3.15);
		produtos.fecharArquivo();
		
		funcionarios.abrirArquivo();
		funcionarios.listarRegistros();
		funcionarios.fecharArquivo();
		
		produtos.abrirArquivo();
		produtos.listarRegistros();
		produtos.fecharArquivo();
		
	}
	
}
