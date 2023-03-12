//*****AULA3********//

package introducao;

import java.util.Scanner;

public class ExemploAula3 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o Valor do Boleto: ");
		double valorBoleto = entrada.nextDouble();
		
		System.out.println("Informe o Data do Vencimento: ");
		int diaVencimento = entrada.nextInt();
		
		System.out.println("Informe o Data do Pagamento: ");
		int diaPagamento = entrada.nextInt();
		
		int diasEmAtraso = diaVencimento - diaPagamento;
		
		if (diaVencimento >= diaPagamento) {
			System.out.println("Obrigado, o seu boleto foi pago sem juros.");
		
		}else if (diaVencimento < diaPagamento) {
			System.out.println("Dias: " + diasEmAtraso);
			System.out.println("");
			System.out.println("R$ " + valorBoleto);
		}
		
		entrada.close();
		
	}

}
