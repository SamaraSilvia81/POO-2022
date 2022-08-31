package aula02;

import java.util.Scanner;

public class Pessoa {
	
	// Aula prática conceitos básicos de POO
			// Exemplos básicos
	
	public class MinhaClasse{
		
		Scanner leitor = new Scanner (System.in);
		
		// Meus atributos.
		
		String meuNome = "Samara";
		int minhaIdade = 18;
		
		// Métodos da minha classe
		// <tipoRetorno> nomeMetodo (<Parâmetros>){corpo do texto}
		
		boolean caminhar() {
			return true;
		}
		
		void tipoAlimentar() {
			
			System.out.println("Essa usuária é carnívora");
		}
		
		void ehAdulto(int idade) {
			if(idade>= 18) {
				System.out.println(this.meuNome + "Você é adulto");
			}else {
				System.out.println(this.meuNome + "Você não é adulto");
			}
		}
		
	}

}
