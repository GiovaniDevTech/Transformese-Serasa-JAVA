package introducao;

import java.util.Scanner;

public class Aula7a1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int somaNumeros = 0;
		
		while (somaNumeros < 100) {
			System.out.println("Digite um número: ");
			int numero = scanner.nextInt();
			somaNumeros += numero;
		}
		
		System.out.printf("Soma dos números é: %d%n", somaNumeros);
		scanner.close();
	}

}
