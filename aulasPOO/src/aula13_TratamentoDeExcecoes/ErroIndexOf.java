package aula13_TratamentoDeExcecoes;

import java.util.Scanner;

public class ErroIndexOf {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int posicao;
	
		int [] array = new int [3];
				
		System.out.println("Digite o 3 valores");
		
		for(int i = 0; i< array.length;i++) {
			array[i] = entrada.nextInt();
		}
		
		System.out.print("Digite outro valor: ");
		posicao = entrada.nextInt();
	
		try {
			System.out.println(array[posicao]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição requisitada não existente");
		} finally {
			System.out.println("Enviando...");
		}
	}
}
