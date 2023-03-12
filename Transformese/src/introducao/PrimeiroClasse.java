//*************PRIMEIROCLASSE************//

package introducao;

public class PrimeiroClasse {

	public static void main(String[] args) {

		String nome = "Giovani";
		int idade = 10;
		double altura = 1.75;
		boolean estaCalor = true;
		

		System.out.println("nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Está calor? " + estaCalor);
		System.out.println("");
		
		int media = 5;
		
		System.out.println("O Valor da média é " + media);
		System.out.println("");
		
		media = 10;
		
		System.out.println("O Valor da média é " + media);
		System.out.println("");
		
		final int hora = 24;
		System.out.println("hora: " + hora + "hs");
		System.out.println("");
		
		String sobreNome = "Vieira";
		System.out.println("");

		System.out.println("Length é quantos letra seu nome aqui...");
		System.out.println(nome + ": " + nome.length() + ", " + sobreNome + ": " + sobreNome.length());
		System.out.println("");
		System.out.println(sobreNome.toUpperCase());
		System.out.println("");

		System.out.println(sobreNome.equals("Zenita"));
		System.out.println("");
		
		int a = 5;
		int b = 5;
		
		System.out.println("operadores aritméticos");
		
		System.out.println("Adição: " + (a + b));
		System.out.println("Subtração: " + (a - b));
		System.out.println("Multiplicação: " + (a * b));
		System.out.println("Divisão: " + (a / b));
		System.out.println("O resto da divisão é " + 11 % 3);
		
		
	}
}

