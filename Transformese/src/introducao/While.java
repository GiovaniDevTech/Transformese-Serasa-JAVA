package introducao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int resposta;
		int total = 0;

		do {
			System.out.println("Digite Número: ");
			int numero = entrada.nextInt();

			total = total + numero;

			do {
				System.out.println("Digite pode outro número : 1 - Continuar ou 2 - Parar");
				resposta = entrada.nextInt();

				if (resposta < 1 || resposta > 2) {
					System.out.println("Responder Inválida!! ");
				}

			} while (resposta < 1 || resposta > 2);
		} while (resposta != 2);
		System.out.print("Somar dos Números : " + total + "\n");
		System.out.print("\n Fim, Obrigado!!! :)");

		entrada.close();
	}
}