package aula03;

import java.util.Scanner;

public class Pessoa {
	
	// Aula prática conceitos básicos de POO
			// Exemplos básicos
			
				
				Scanner leitor = new Scanner (System.in);
				
				// Meus atributos.
				
				String nome;
				String tipoAlimentar;
				int idade;
				boolean feedback1;
				
				// Métodos da minha classe
				// <tipoRetorno> nomeMetodo (<Parâmetros>){corpo do texto}
				
				
				void ehAdulto() {
					if(this.idade>= 18) {
						System.out.println("ChatBoot - Que legal! " + nome + ". Então, você é adulto, já pode dirigir ein.");
					}else {
						System.out.println("ChatBoot - Que legal! " + nome + ". Então, você não é adulto.");
					}
				}
				
				void caminhar() {
					
					if(this.feedback1 == true) {
						System.out.println("ChatBoot - Muito bom que você realiza caminhadas. Elas fazem bem para a saúde");
					} else {
						System.out.println("ChatBoot - Você não realiza caminhadas. Que pena !!");
					}	
				}
				
				void estiloAlimentar() {
					
					if (this.tipoAlimentar == "carne" || this.tipoAlimentar == "Carne") {
						System.out.println("ChatBoot - Ahhh, então você é carnívora");
					} else if (this.tipoAlimentar == "") {
						System.out.println("ChatBoot - Ahhh, então Você é vegana/vegetariana");
					} else {
						System.out.println("Ahh. Você não quer responder? Tudo bem.");
					}
				}

}
