package aula03;

import java.util.Scanner;

public class Pessoa {
	
	// Aula pr�tica conceitos b�sicos de POO
			// Exemplos b�sicos
			
				
				Scanner leitor = new Scanner (System.in);
				
				// Meus atributos.
				
				String nome;
				String tipoAlimentar;
				int idade;
				boolean feedback1;
				
				// M�todos da minha classe
				// <tipoRetorno> nomeMetodo (<Par�metros>){corpo do texto}
				
				
				void ehAdulto() {
					if(this.idade>= 18) {
						System.out.println("ChatBoot - Que legal! " + nome + ". Ent�o, voc� � adulto, j� pode dirigir ein.");
					}else {
						System.out.println("ChatBoot - Que legal! " + nome + ". Ent�o, voc� n�o � adulto.");
					}
				}
				
				void caminhar() {
					
					if(this.feedback1 == true) {
						System.out.println("ChatBoot - Muito bom que voc� realiza caminhadas. Elas fazem bem para a sa�de");
					} else {
						System.out.println("ChatBoot - Voc� n�o realiza caminhadas. Que pena !!");
					}	
				}
				
				void estiloAlimentar() {
					
					if (this.tipoAlimentar == "carne" || this.tipoAlimentar == "Carne") {
						System.out.println("ChatBoot - Ahhh, ent�o voc� � carn�vora");
					} else if (this.tipoAlimentar == "") {
						System.out.println("ChatBoot - Ahhh, ent�o Voc� � vegana/vegetariana");
					} else {
						System.out.println("Ahh. Voc� n�o quer responder? Tudo bem.");
					}
				}

}
