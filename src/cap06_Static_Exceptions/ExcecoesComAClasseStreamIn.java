package cap06_Static_Exceptions;

public class ExcecoesComAClasseStreamIn {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		StreamIn streamIn = new StreamIn();
		String nome;
		int idade;
		double salario;
		
		System.out.print("Digite o nome: ");
		nome = streamIn.lerString();
		System.out.print("Digite a idade: ");
		idade = streamIn.lerInteger();
		System.out.print("Digite o salário: ");
		salario = streamIn.lerDouble();
		
		System.out.printf("Nome: %s\nIdade: %d\nSalário: %3.2f.", nome, idade, salario);
	}
	
}
