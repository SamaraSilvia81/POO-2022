package questao02_Animal;

public class TesteAnimal {
	
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("Luke","Pastor Alemão","Sim");
		dog.Animal();
		
		Gato cat = new Gato("Sophia","Angorá","Não");
		System.out.println("-----------------------");
		cat.Animal();

	}

}
