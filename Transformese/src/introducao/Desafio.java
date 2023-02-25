package introducao;
import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String nome, sobrenome, nascimento, idade;
		int opcao = 0;
		
		System.out.println("Qual é o seu nome?");
		nome = teclado.next();
		System.out.println("\n");
		System.out.println("Qual é o seu sobrenome?");
		sobrenome = teclado.next();
		System.out.println("\n");
		System.out.println("Qual seu idade?");
		idade = teclado.next();
		System.out.println("\n");
		System.out.println("Data de nascimento?");
		nascimento = teclado.next();
		System.out.println("\n");
		
		while (opcao != 4) {

			System.out.println("============= Informações =================");
			System.out.println();
			System.out.println("1 - Informação de Cadastro");
			System.out.println();
			System.out.println("2 - Calculadora");
			System.out.println();
			System.out.println("3 - Par OU Impar ");
			System.out.println();
			System.out.println("4 - Sair ");
			System.out.println();
			System.out.println("================================================================");
			System.out.println();

			opcao = teclado.nextInt();

			switch (opcao) {
			
			case 1:
				System.out.println("Nome: " + nome + "\n");
				System.out.println("Sobrenome: " + sobrenome + "\n");
				System.out.println("Idade: " + nascimento + "\n");
				System.out.println("Data de Nascimento: " + idade + "\n");
				break;
			case 2:
				System.out.println("Informar número: " + "\n");
				int num1 = teclado.nextInt();
				System.out.println("Informar número outro: " + "\n");
				int num2 = teclado.nextInt();

				System.out.println("Somar: " + (num1 + num2) + "\n");
				System.out.println("Subtrair: " + (num1 - num2) + "\n");
				System.out.println("Multiplicar: " + (num1 * num2) + "\n");
				System.out.println("Dividir: " + (num1 / num2) + "\n");
				break;
			case 3:
				System.out.println("Informar número inteiro: " + "\n");
				int num = teclado.nextInt();
				
				if(num % 2 == 0){
					System.out.println("O número : " + num + " é PAR \n");
				}else{
					System.out.println("O número : " + num + " é IMPAR \n");
				}
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