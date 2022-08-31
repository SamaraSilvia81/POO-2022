package aula03;

import java.util.Scanner;

public class TestePessoa {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		Pessoa p1 = new Pessoa();
		
		System.out.println("ChatBoot - Olá! Eu quero te conhecer melhor, então por favor responda a algumas perguntas.");
		System.out.println("ChatBoot - Qual o seu nome?");
		p1.nome = leitor.next();
		
		System.out.println("ChatBoot - Certo " + p1.nome  + ". E quantos anos você tem?");
		p1.idade = leitor.nextInt();
		p1.ehAdulto();
		
		/*System.out.println("ChatBoot - Você caminha?");
		p1.feedback1 = leitor.hasNext();
		p1.caminhar(p1.feedback1);*/
		
		System.out.println("ChatBoot - Que tipo de comida você gosta? Carne, frango...");
		p1.tipoAlimentar = leitor.next();
		p1.estiloAlimentar();
		
		System.out.println("ChatBoot - Obrigada pela conversa agradável!! Tchauzinhooooo.");
		
		
	}
}
