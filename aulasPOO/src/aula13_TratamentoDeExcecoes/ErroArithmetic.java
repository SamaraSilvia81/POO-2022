package aula13_TratamentoDeExcecoes;

import java.util.Scanner;

public class ErroArithmetic {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valorA;
		int valorB;
		int results;
	
		System.out.print("Digite um numerador: ");
		valorA = entrada.nextInt();
		
		System.out.print("Digite um Denominadaor: ");
		valorB = entrada.nextInt();
	
		try {
			results = valorA/valorB;
		} catch(ArithmeticException e) {
			System.out.println("Não é possível fazer a divisão por 0");
		} finally {
			System.out.println("Enviando...");
		}
		
		// bounds - area delimitada

	}
}
