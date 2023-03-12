
package introducao;
import java.util.Scanner;

public class aula5 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String nomepj = "", cnpj = "";
		String nomepf = "", cpf = "";
		int opcao = 0;

		System.out.println("Informe Hora do dia");
		int hora = teclado.nextInt();

		while (opcao != 4) {
			System.out.println("============= Informações =================");
			System.out.println();
			System.out.println("1 - Cadastro (PF)");
			System.out.println();
			System.out.println("2 - Cadastro (PJ)");
			System.out.println();
			System.out.println("3 - Consultar PF | PJ");
			System.out.println();
			System.out.println("4 - Sair");
			System.out.println();
			System.out.println("================================================================");
			System.out.println();

			opcao = teclado.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Informaçãoz Tipo de Pessoa \n");
				System.out.println("Qual é o nome de PF");
		        nomepf = teclado.next();
				System.out.println("Digite seu CPF de PF");
		        cpf = teclado.next();
				
				break;
			case 2:
				System.out.println("Informação Tipo de Pessoa");
				System.out.println("Qual é o nome de PJ");
		        nomepj = teclado.next();
				System.out.println("Digite seu CNPJ de PJ");
		        cnpj = teclado.next();
				break;
	        case 3: 
				System.out.println("Digite LETRA 'pj' ou 'pf'?");
				String pjoupf = teclado.next();
				
				if (hora >= 6 && hora <= 12) {
					System.out.println("Bom dia, hora: " + hora + "h");
				} else if (hora >= 13 && hora <= 18) {
					System.out.println("Boa tarde, hora: " + hora + "h");
				} else {
					System.out.println("Boa noite, hora: " + hora + "h");
				}
				
				if(pjoupf.equals("pj")) {
					System.out.println("Tipo de Pessoa: Pessoa Fisica (PF)");
					System.out.println("Nome de PF: " + nomepf);
					System.out.println("CPF de PF: " + cpf);
				} else if(pjoupf.equals("pf")){
					System.out.println("Tipo de Pessoa: Pessoa Juridica (PJ)");
					System.out.println("Nome de PJ: " + nomepj);
					System.out.println("CNPJ de PF: " + cnpj);
				}
	            break;
	        case 4: 
				System.out.println("Sair...");
	        }
		}
		teclado.close();
	}
}