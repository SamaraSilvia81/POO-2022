package aula12_Interface;

public class TesteAnimal {
	
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("Bruno",5,"Pastor Alem�o");

		System.out.println("O nome do  meu cachorro � " + dog.getNome());
		System.out.println("Ele tem " + dog.getIdade() + " anos");
		System.out.println("� um " + dog.getRaca());
		dog.acordar();
		dog.comer("Frango");
		
	}
}
