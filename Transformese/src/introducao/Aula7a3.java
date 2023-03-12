package introducao;

import java.util.Scanner;

public class Aula7a3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int somaNumeros = 0;
		
		for (int repetir = 1; repetir <= 4; repetir++) {
			System.out.print("Digite um número: ");
			int numero = scanner.nextInt();
			
			somaNumeros += numero;
		}
		
		System.out.printf("Soma dos números é %d%n", somaNumeros);
		scanner.close();
	}

}
