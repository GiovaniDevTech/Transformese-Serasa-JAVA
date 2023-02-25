package introducao;

public class PrimeiroClasse {

	public static void main(String[] args) {
	
		
		// isso aqui é um comentario
		
		/*
		isso aqui é um comentario de mais uma linha
		*/
		// este é o método para imprimir no console
		//System.out.println("Giovani");

		// variaveis
		// tipo, o nome e o valor
		
		int idade = 10; // inteiro
		double altura = 1.75; // decimal
		String nome = "Giovani"; //String ou palavras
		boolean estaCalor = true;
		
		// constante
		
		int media = 5;
		
		System.out.println("O Valor da média é " + media);
		
		media = 10;
		
		System.out.println("O Valor da média é " + media);
		
		// não pode 
		// media = 10;
		
		final int HORA = 24;
		
		// Strings
		
		String sobreNome = "Vieira";
		
		System.out.println(sobreNome.length());
		System.out.println(sobreNome.toUpperCase());
		System.out.println(sobreNome.toUpperCase());
		
		System.out.println(sobreNome.equals("Zenita"));
			
		// Operadores Aritméticos
		
		int a = 5;
		int b = 5;
		
		System.out.println("operadores aritméticos");
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		
		// módulo, o resto de uma divisão
		System.out.println("O resto da divisão é " + 11 % 3);
		
		
	}
}

