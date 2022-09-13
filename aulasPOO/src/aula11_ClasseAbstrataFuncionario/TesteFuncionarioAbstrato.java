package aula11_ClasseAbstrataFuncionario;

import java.util.Scanner;


public class TesteFuncionarioAbstrato {
		
		public static void menu() {
		       
			System.out.println("\nSISTEMA DE GERENCIONAMENTO DE FUNCIONÁRIO");
	        System.out.println("\n0. Fim");
	        System.out.println("1. Gerente");
	        System.out.println("2. Programador");
	        System.out.print("\nOpcao:");
	    }
		
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			Gerente g = new Gerente();
			Programador p = new Programador();
			
			g.setNome("Samara");
			g.setSalario(300);
			
			p.setNome("Maria Eduarda Souto");
			p.setSalario(200);
			
			
			 int opcao;

		        do{
		        	menu();
		            opcao = entrada.nextInt();
		            
		            switch(opcao){
		            
		            case 0:
		            	
		            	System.out.println("Obrigada.Tchau!");
		            	
		                break;
		            	
		            case 1:
		        
		            	System.out.println("\nNome do Gerente: " + g.getNome());
		        		System.out.println("Salário: " + g.getSalario());
		        		System.out.print("Aumento de Salário: ");
		        		g.aumentaSalario();
		            	
		          
		                break;
		                
		            case 2:
		            
		            	System.out.println("\nNome do Programador: " + p.getNome());
		        		System.out.println("Salário: " + p.getSalario());
		        		System.out.print("Aumento de Salário: ");
		        		p.aumentaSalario();
		
		                break;
		                
		            default:
		                System.out.println("Opção inválida.");
		                
	       	            }
	       	        } while(opcao != 0);
			
		}

}
