package introducao;

import java.util.Scanner;

public class Aula7a2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int digitarProximo;
		int somaTotal = 0;

		do {
			System.out.println("Digite um número: ");
			int numero = scanner.nextInt();
			somaTotal += numero;
			System.out.printf("Deseja digitar outro número? \n 1 - Continua | 2 - Parar: ");
			digitarProximo = scanner.nextInt();
		} while (digitarProximo != 2);
		System.out.printf("A Soma dos números digitados foi de: %d", somaTotal);
		scanner.close();
	}

}
