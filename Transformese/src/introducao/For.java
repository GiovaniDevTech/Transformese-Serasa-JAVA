package introducao;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int somar = 0;
		
		for (int g =1; g<=6; g++) {
			
			System.out.println("Digite Número: ");
			int numero = scanner.nextInt();
			somar +=numero;
			
		}
		
		System.out.println("Somar dos Números :" + somar);
		
		scanner.close();
	}

}
