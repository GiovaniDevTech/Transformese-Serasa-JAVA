//*****DESAFIO******//

package introducao;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {

		System.out.println("**********************************************");
		System.out.println(">>>>>>>>>>>>>>>>Dados Pessoais<<<<<<<<<<<<<<<<");
		System.out.println("**********************************************");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cadastro, seu nome?");
		String nome = teclado.nextLine();

		System.out.println("Qual seu Sobrenome?");
		String sobrenome = teclado.nextLine();
		
		System.out.println("Qual seu Idade?");
		String idade = teclado.nextLine();

		System.out.println("Data de Nascimento?");
		String nascimento = teclado.nextLine();
		

		System.out.println("Naturalidade?");
		String naturalidade = teclado.nextLine();
		
		System.out.println("Olá, " + nome + " " + sobrenome + ". seu idade " + idade + " anos, sua data de nascimento é " + nascimento + ". seu cidade naturalidade " + naturalidade + ".");
		
		System.out.println( "**********************************************");
		System.out.println(">>>>>>>>>>>>>>>>>>>Calculdora<<<<<<<<<<<<<<<<<<<");
		System.out.println( "**********************************************");
		
		System.out.println("Informação um número");
		int num1 = teclado.nextInt();
		
		System.out.println("Informação tenho outro número");
		int num2 = teclado.nextInt();
		
		System.out.println("Somar: " + (num1 + num2));
		System.out.println("Subtrair: " + (num1 - num2));
		System.out.println("Multiplicar: " + (num1 * num2));
		System.out.println("Dividir: " + (num1 / num2));
	
		System.out.println( "**********************************************************");
		System.out.println(">>>>>>>>>>>>>>>>>>>DESAFIO - PAR OU IMPAR<<<<<<<<<<<<<<<<<<<");
		System.out.println( "**********************************************************");
		
		System.out.println("Digite um número inteiro: ");
		int num = teclado.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("O número " + num + " é PAR");
		}else if (num % 2 == 1) {
			System.out.println("O número " + num + " é IMPAR");
		}
		
		teclado.close();
	}

}
