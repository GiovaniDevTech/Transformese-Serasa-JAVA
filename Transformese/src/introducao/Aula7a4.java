package introducao;

import java.util.Scanner;

public class Aula7a4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int somaNumeros = 0;
		
		for (int repetir = 1; repetir <= 4; repetir++) {
			System.out.print("Digite um número par: ");
			int numero = scanner.nextInt();
			
			if (numero % 2 == 0) {
				somaNumeros += numero;
			} else {
				repetir--;
			}
		}
		
		System.out.printf("Soma dos números pares: %d%n", somaNumeros);
		
		scanner.close();
	}

}
