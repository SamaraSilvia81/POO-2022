package aula04_testeCliente2;

import aula04.Cliente; // Aparece porque estamos tewntando acessar uma classe que pertence a outra sec��o.

public class Cliente2 {
	
	public static void main(String[] args) {
		
		Cliente c = new Cliente ();
		
		System.out.println(c.id);
		// System.out.println(c.endereco); // Voc� n�o pode acessar, porque est� protegido.
	}
}

