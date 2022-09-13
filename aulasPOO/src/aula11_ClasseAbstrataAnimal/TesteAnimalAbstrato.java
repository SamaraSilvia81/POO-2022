package aula11_ClasseAbstrataAnimal;

public class TesteAnimalAbstrato {
	
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Gato cat = new Gato();
	
		dog.setNome("Bruno");
		dog.setRaca("Pastor Alemão");
		
		cat.setNome("Sophia");
		cat.setRaca("Angorá Turco");
		
		System.out.println("Nome do cachorro: " + dog.getNome());
		System.out.println("Raça do cachorro: " + dog.getRaca());
		System.out.print("Forma de comunicação: ");
		dog.seComunicar();
		
		System.out.println("------------------");
		
		System.out.println("Nome do Gato: " + cat.getNome());
		System.out.println("Raça do Gato: " + cat.getRaca());
		System.out.print("Forma de comunicação: ");
		cat.seComunicar();
	}
}
