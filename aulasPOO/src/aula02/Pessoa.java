package aula02;

import java.util.Scanner;

public class Pessoa {
	
	// Aula pr�tica conceitos b�sicos de POO
			// Exemplos b�sicos
	
	public class MinhaClasse{
		
		Scanner leitor = new Scanner (System.in);
		
		// Meus atributos.
		
		String meuNome = "Samara";
		int minhaIdade = 18;
		
		// M�todos da minha classe
		// <tipoRetorno> nomeMetodo (<Par�metros>){corpo do texto}
		
		boolean caminhar() {
			return true;
		}
		
		void tipoAlimentar() {
			
			System.out.println("Essa usu�ria � carn�vora");
		}
		
		void ehAdulto(int idade) {
			if(idade>= 18) {
				System.out.println(this.meuNome + "Voc� � adulto");
			}else {
				System.out.println(this.meuNome + "Voc� n�o � adulto");
			}
		}
		
	}

}
