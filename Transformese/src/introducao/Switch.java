//************SWITCH*************//

package introducao;

public class Switch {
	public static void main(String[] args) {
		
		int nota = 5;
		
		switch (nota) {
		case 4:
			System.out.println("você perdeu esta reprovado! :( ");
			break;
		case 5:
			System.out.println("Você conseguir está aprovado");
			break;
		case 6:
			System.out.println("Você está aprovado");
			break;
		case 7:
			System.out.println("Você está aprovado continuar");
			break;
		case 8:
			System.out.println("Inválido :/");
			break;
		
		}
	}
	
}