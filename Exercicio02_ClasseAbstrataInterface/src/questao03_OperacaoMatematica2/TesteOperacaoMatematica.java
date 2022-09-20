package questao03_OperacaoMatematica2;

import java.util.Scanner;

 class TesteOperacaoMatematica {
	
	public static void menu() {
	       
		System.out.println("\nOPERAÇÃO MATEMÁTICA");
        System.out.println("\n0. Fim");
        System.out.println("1. Soma");
        System.out.println("2. Substracao");
        System.out.println("3. Divisão");
        System.out.println("4. Multiplicação");
        System.out.print("\nOpcao:");
    }
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double valorA = 0;
		double valorB = 0;
		
		 int opcao;
		 
		 Soma push = new Soma(valorA,valorB);
		 Subtracao subs = new Subtracao(valorA,valorB);
		 Divisao div = new Divisao(valorA,valorB);
		 Multiplicacao multi = new Multiplicacao(valorA,valorB);
		 
	        do{
	        	menu();
	            opcao = entrada.nextInt();
	            
	            switch(opcao){
	            
	            case 0:
	            	
	            	System.out.println("Obrigada.Tchau!");
	            	
	                break;
	            	
	            case 1:
	        
	            	 System.out.print("Valor 1: ");
	            	 valorA = entrada.nextInt();
	            	 
	            	 System.out.print("Valor 2: ");
	            	 valorB = entrada.nextInt();
	            	 
	            	 push.setValorA(valorA);
	            	 push.setValorB(valorB);
	            	 
	            	 push.calcula();
	            	
	                break;
	                
	            case 2:
	            
	            	 System.out.print("Valor 1: ");
	            	 valorA = entrada.nextInt();
	            	 
	            	 System.out.print("Valor 2: ");
	            	 valorB = entrada.nextInt();
	            	 
	            	 subs.setValorA(valorA);
	            	 subs.setValorB(valorB);
	            	 
	            	 subs.calcula();
	            	
	                break;
	                
	            case 3:
		            
	            	 System.out.print("Valor 1: ");
	            	 valorA = entrada.nextInt();
	            	 
	            	 System.out.print("Valor 2: ");
	            	 valorB = entrada.nextInt();
	            	 
	            	 div.setValorA(valorA);
	            	 div.setValorB(valorB);
	            	 
	            	 div.calcula();
	            	
	                break;
	                
	            case 4:
		            
	            	 System.out.print("Valor 1: ");
	            	 valorA = entrada.nextInt();
	            	 
	            	 System.out.print("Valor 2: ");
	            	 valorB = entrada.nextInt();
	            	 
	            	 multi.setValorA(valorA);
	            	 multi.setValorB(valorB);
	            	 
	            	 multi.calcula();
	            	
	                break;
	                
	            default:
	                System.out.println("Opção inválida.");
	                
       	            }
       	        } while(opcao != 0);
		
	}

}
