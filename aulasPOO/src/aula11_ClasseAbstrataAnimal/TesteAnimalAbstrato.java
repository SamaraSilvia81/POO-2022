package aula11_ClasseAbstrataAnimal;

public class TesteAnimalAbstrato {
	
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Gato cat = new Gato();
	
		dog.setNome("Bruno");
		dog.setRaca("Pastor Alem�o");
		
		cat.setNome("Sophia");
		cat.setRaca("Angor� Turco");
		
		System.out.println("Nome do cachorro: " + dog.getNome());
		System.out.println("Ra�a do cachorro: " + dog.getRaca());
		System.out.print("Forma de comunica��o: ");
		dog.seComunicar();
		
		System.out.println("------------------");
		
		System.out.println("Nome do Gato: " + cat.getNome());
		System.out.println("Ra�a do Gato: " + cat.getRaca());
		System.out.print("Forma de comunica��o: ");
		cat.seComunicar();
	}
}
