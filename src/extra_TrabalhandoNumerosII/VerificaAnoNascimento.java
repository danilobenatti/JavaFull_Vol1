package extra_TrabalhandoNumerosII;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class VerificaAnoNascimento {
	
	static Locale locale = new Locale("pt", "BR");
	static NumberFormat nf = NumberFormat.getNumberInstance(locale);
	
	public static void main(String[] args) {
		
		Date now = new Date();
		List<Date> datasnascimentos = new ArrayList<>();
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println(
					"Informe data(s) de nascimento(s)[dia/mês/ano, ex.: 25/4/1996]");
			boolean repetir = true;
			int i = 0;
			do {
				System.out.printf("Data de Nascimento (%d): ", ++i);
				if (input.hasNext()) {
					datasnascimentos.add(scannerDate(input, "dd/MM/yyyy"));
					System.out.print("Deseja informar outra data(s/n)? ");
					repetir = input.nextLine().equalsIgnoreCase("s");
				}
			} while (repetir);
			
			List<Integer> yearsOld = new ArrayList<>();
			
			int j = 0;
			int k = 0;
			for (Date dateBorn : datasnascimentos) {
				if (dateBorn.before(now)) {
					long miliseconds = (now.getTime() - dateBorn.getTime());
					yearsOld.add((int) (miliseconds / 3.154E+10));
					System.out.printf("Pessoa(%d): %d anos.%n", ++j,
							yearsOld.get(k++));
				} else {
					System.out.printf("Pessoa(%d) ainda não nasceu!%n", ++j);
				}
			}
			
			System.out.println("Idades consideradas: " + yearsOld.toString());
			
			IntSummaryStatistics dss = yearsOld.stream().mapToInt(a -> a)
					.summaryStatistics();
			
			System.out.println("Média: " + nf.format(dss.getAverage()));
			System.out.println("Idade maior: " + nf.format(dss.getMax()));
			System.out.println("Idade menor: " + nf.format(dss.getMin()));
		}
	}
	
	public static Date scannerDate(Scanner sc, String format) {
		try {
			return new SimpleDateFormat(format, locale).parse(sc.nextLine());
		} catch (ParseException ex) {
			ex.printStackTrace();
		}
		return null;
	}
}
