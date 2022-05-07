package cap08_Arquivos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * fonte: Java Full - Teoria e Prática
 * 
 * @author Romuel Dia Oliveira
 *
 */
public class GravarArquivoTexto {
	
	private Formatter saida;
	private Scanner entrada;
	private String nomeArquivo;
	
	public GravarArquivoTexto(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	public void gerarArquivo() {
		try {
			saida = new Formatter(nomeArquivo);
		} catch (SecurityException e) {
			System.err.println("Permissão negada para gravar.");
			System.exit(1);
		} catch (FileNotFoundException e) {
			System.err.println("Erro ao abrir o arquivo.");
			System.exit(1);
		}
	}
	
	public void abrirArquivo() {
		try {
			entrada = new Scanner(Paths.get(nomeArquivo));
		} catch (IOException e) {
			System.err.println("Erro ao abrir o arquivo.");
			System.exit(1);
		}
	}
	
	public void fecharArquivo() {
		if (saida != null) {
			saida.close();
		}
		if (entrada != null) {
			entrada.close();
		}
	}
	
	@SuppressWarnings("resource")
	public void adicionarRegistro(int id, String nome, double valor) {
		Scanner scanner = new Scanner(System.in);
		try {
			saida.format("%-10d %-10s %10.2f%n", id, nome, valor);
		} catch (FormatterClosedException e) {
			System.err.println("Erro ao gravar no arquivo.");
		} catch (NoSuchElementException e) {
			System.err.println("Entrada de dados errada.");
			scanner.nextLine();
		}
	}
	
	public void listarRegistros() {
		System.out.printf("\n\nArquivo: %s.\n", this.nomeArquivo);
		try {
			while (entrada.hasNext()) {
				System.out.printf("%-10d %-10s %10.2f%n", entrada.nextInt(),
						entrada.next(), entrada.nextDouble());
			}
		} catch (NoSuchElementException e) {
			System.err.println("Erro de dados.");
		} catch (IllegalStateException e) {
			System.err.println("Erro ao ler o arquivo.");
		}
		
	}
	
}
