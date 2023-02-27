package introducao;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CobrancaAula4 {
	public static void main(String[] args) throws ParseException {
		Scanner teclado = new Scanner(System.in);

		String DigitarCliente;
	    String DigitarData;
	    String DigitarVencimento;
		double DigitarValor;
		int opcao = 0;

		System.out.println("Qual é o seu cliente?");
		DigitarCliente = teclado.next();
		System.out.println("\n");

		System.out.println("Qual é o valor?");
		DigitarValor = teclado.nextDouble();
		System.out.println("\n");

		System.out.println("Data atual: ex: 2022-02-27");
		DigitarData = teclado.next();
		System.out.println("\n");

		System.out.println("Data vencimento: ex: 2022-02-27");
		DigitarVencimento = teclado.next();
		System.out.println("\n");

		while (opcao != 4) {

			System.out.println("============= Informações =================");
			System.out.println();
			System.out.println("1 - Consulta de Cliente e Cobrança");
			System.out.println();
			System.out.println("2 - Alterar valor");
			System.out.println();
			System.out.println("3 - Alterar data de vencimento");
			System.out.println();
			System.out.println("4 - Sair ");
			System.out.println();
			System.out.println("================================================================");
			System.out.println();

			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Nome: " + DigitarCliente + "\n");

				LocalDate data       = LocalDate.parse(DigitarData);
				LocalDate vencimento = LocalDate.parse(DigitarVencimento);
				long atrasar = ChronoUnit.DAYS.between(vencimento,data);

				if(atrasar > 0 && atrasar <= 10) {
					double multa = atrasar * 1.0;
					double total = multa + DigitarValor;
					System.out.printf("O Valor da multa é R$ %.2f", multa);
					System.out.println();
					System.out.printf("O valor original é R$ %.2f", total);
					System.out.println();
					System.out.printf("Total é R$ %.2f", (multa + total));
				}else if (atrasar > 10) {
					double multa = 1.5;
					double total = multa = DigitarValor;
					System.out.printf("O Valor da multa é R$ %.2f", multa);
					System.out.println();
					System.out.printf("O valor original é R$ %.2f", total);
					System.out.println();
					System.out.printf("Total é R$ %.2f", (multa + total));
				}else {
					System.out.println("Não possui multa!");
				}
				System.out.println("\n");
				break;
			case 2:
				System.out.println("============= Alterar valor =================");
				System.out.println("Qual alterar valor?");
				DigitarValor = teclado.nextDouble();
				System.out.println("\n");
				break;
			case 3:
				System.out.println("============= Alterar data de vencimento =================");
				System.out.println("Alterar data atual: ex: 2022-02-27");
				DigitarData = teclado.next();
				System.out.println("\n");

				System.out.println("Alterar data vencimento: ex: 2022-02-27");
				DigitarVencimento = teclado.next();
				System.out.println("\n");

				break;
			case 4:
				System.out.println("Sair... \n");
				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}
		}
		teclado.close();
	}
}