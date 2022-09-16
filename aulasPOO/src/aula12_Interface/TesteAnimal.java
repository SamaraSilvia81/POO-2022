package aula12_Interface;

public class TesteAnimal {
	
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("Bruno",5,"Pastor Alemão");

		System.out.println("O nome do  meu cachorro é " + dog.getNome());
		System.out.println("Ele tem " + dog.getIdade() + " anos");
		System.out.println("É um " + dog.getRaca());
		dog.acordar();
		dog.comer("Frango");
		
	}
}
