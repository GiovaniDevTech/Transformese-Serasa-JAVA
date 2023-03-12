package Animal;

import Animal.model.animal;

public class inicio {

	public static void main(String[] args) {
		animal animal = new animal();
		
		animal.setNome("Kiko");
		animal.setSexo('M');
		animal.setIdade(21);
		animal.setNasceu("Rio Negrinho");
		animal.setCores("Marrom");
		animal.setUF("SC");
		animal.setRaca("Raça Golden");
		animal.setDono("Giovani");
		animal.setPeso(5);
		animal.setServico("Banho + Tosa + Unha");
		animal.setValor(75);
		
		
	    System.out.println("Nome: " + animal.getNome());
	    System.out.println("Sexo: " + animal.getSexo());
	    System.out.println("Idade: " + animal.getIdade());
	    System.out.println("Nascimento Cidade: " + animal.getNasceu());
	    System.out.println("UF: " + animal.getUF());
	    System.out.println("Cores: " + animal.getCores());
	    System.out.println("Dono: " + animal.getDono());
	    System.out.printf("Peso: %.1f kg" , animal.getPeso());
	    System.out.println();
	    System.out.println("Serviço: " + animal.getServico());
	    System.out.printf("Valor: %.2f" , animal.getValor());
	    
	   
	    
	}

	
	
	
	

}
