package cap08_Arquivos;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * SerializaObjeto.java
 * 
 * @author danil
 *
 */
public class SerializaObjeto {
	
	private ObjectOutputStream saida;
	private ObjectInputStream entrada;
	private String nomeArquivo;
	
	public SerializaObjeto(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	public void gerarArquivo() {
		try {
			saida = new ObjectOutputStream(Files.newOutputStream(Paths.get(nomeArquivo)));
		} catch (IOException e) {
			System.err.println("Erro ao gerar o arquivo.");
			System.exit(1);
		}
	}
	
	public void abrirArquivo() {
		try {
			entrada = new ObjectInputStream(Files.newInputStream(Paths.get(nomeArquivo)));
		} catch (IOException e) {
			System.err.println("Erro ao abrir o arquivo.");
			System.exit(1);
		}
	}
	
	public void fecharArquivo() {
		try {
			if (saida != null) {
				saida.close();
			}
			if (entrada != null) {
				entrada.close();
			}
		} catch (IOException e) {
			System.err.println("Erro ao fechar o arquivo.");
		}
	}
	
	@SuppressWarnings("resource")
	public void adicionarRegistro(Modelo objeto) {
		Scanner scanner = new Scanner(System.in);
		try {
			saida.writeObject(objeto);
		} catch (IOException e) {
			System.err.println("Erro ao abrir o arquivo.");
			System.exit(1);
		} catch (FormatterClosedException e) {
			System.err.println("Erro ao gravar o arquivo.");
		} catch (NoSuchElementException e) {
			System.err.println("Entrada de dados errada!");
			scanner.nextLine();
		}
	}
	
	public void listarRegistros() {
		System.out.printf("\n\nArquivo: %s\n", this.nomeArquivo);
		try {
			while (true) {
				Modelo objeto = (Modelo) entrada.readObject();
				System.out.printf("%-10d %-10s %10.2f%n", objeto.getId(),
						objeto.getNome(), objeto.getValor());
			}
		} catch (EOFException e) {
			System.out.println("\nFim do arquivo.");
		} catch (ClassNotFoundException e) {
			System.err.println("\nErro de conversão do objeto!");
		} catch (IOException e) {
			System.err.println("\nErro ao abrir o arquivo!");
		}
	}
}
