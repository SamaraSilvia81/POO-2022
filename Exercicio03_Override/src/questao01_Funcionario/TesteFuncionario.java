package questao01_Funcionario;

import java.util.Scanner;

public class TesteFuncionario {
	
	public static void menu() {
	       
		System.out.println("\nFUNCIONÁRIOS DA EMPRESA X");
        System.out.println("\n0. Fim");
        System.out.println("1. Dados dos Funcionários(Gerente/Programador/AnalistaDeSistemas)");
        System.out.println("2. Aumentar Salário - Gerente");
        System.out.println("3. Aumentar Salário - Programador");
        System.out.println("4. Aumentar Salário - Analista de Sistemas");
        System.out.print("\nOpcao:");
    }
	
	public static void statusDosFuncionarios(Funcionario manager, Funcionario prog, Funcionario anaSys) {
		
		System.out.println("#Gerente");
		System.out.println("Nome: " + manager.getNome());
		System.out.println("Salário: " + manager.getSalario());
		System.out.println("---------------------------------");
		System.out.println("#Programador");
		System.out.println("Nome: " + prog.getNome());
		System.out.println("Salário: " + prog.getSalario());
		System.out.println("---------------------------------");
		System.out.println("#Analista de Sistemas");
		System.out.println("Nome: " + anaSys.getNome());
		System.out.println("Salário: " + anaSys.getSalario());
		
    }
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opcao;
		
		Funcionario manager = new Gerente("Thomas",5000); // polimorfismo
		Funcionario prog = new Programador("Samara",7000); // programador extende de funcionario
		Funcionario anaSys = new AnalistaDeSistemas("Alice",4000);
		
		 do {
	        	menu();
	            opcao = entrada.nextInt();
	            
	            switch(opcao){
	            
	            case 0:
	            	
	            	System.out.println("Obrigada.Tchau!");
	            	
	                break;
	            	
	            case 1:
	        
	            	statusDosFuncionarios(manager,prog,anaSys);
	                break;
	                
	            case 2:
	            	
	            	manager.aumentaSalario();
	                break;
	                
	            case 3:
	            	
	            	prog.aumentaSalario();
	                break;
	                
	            case 4:
	            	
	            	anaSys.aumentaSalario();
	                break;
	                
	            default:
	                System.out.println("Opção inválida.");
	                
    	            }
    	        } while(opcao != 0);
	
	}
}
