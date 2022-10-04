package questao03;

import java.util.Scanner;

public class TesteConta {
	
		public static void menu(){

	        System.out.println("\n0. Fim");
	        System.out.println("1. Criar");
	        System.out.println("2. Criar Conta Especial");
	        System.out.println("3. Sacar");
	        System.out.println("4. Depositar");
	        System.out.println("5. Status");
	        System.out.println("6. Fechar");
	        System.out.print("Opcao:");
	    }
		
		public static void menu2(){

	        System.out.println("\n0. Fim");
	        System.out.println("1. Criar");
	        System.out.println("2. Sacar");
	        System.out.println("3. Depositar");
	        System.out.println("4. Status");
	        System.out.println("5. Fechar");
	        System.out.print("Opcao:");
	    }
		
		public static void main(String[] args) {
			
			 Scanner entrada = new Scanner(System.in);
		
			 String nomeDono = null;
			 int numConta = 0;
			 double saque = 0.0;
			 double deposito = 0.0;
			 
			 ContaBase c = new ContaBase(numConta,nomeDono);
			
			 int opcao;

		        System.out.println("\tConta Bancária");
		        
		        do {
		            menu();
		            opcao = entrada.nextInt();
		            
		            switch(opcao){
		            
		            case 1:
		            	
			               System.out.println("\n#Preencha os dados corretamente");
	
			     		   System.out.print("Nome do Dono: ");
			     		   nomeDono = entrada.next();		     		   
			     		   
			     		   System.out.print("Número da Conta: ");
			     		   numConta = entrada.nextInt();

		
			     		   c.abrirConta();   
			     		   c.setNumConta(numConta);
			     		   c.setNomeDono(nomeDono);
		               
		                break;
		                
		            case 2:
		            	
			            	ContaEspecial ce = new ContaEspecial (numConta,nomeDono);
			            	
			            	int opcao2;
	
			 		        System.out.println("\tConta Bancária");
			 		        
			 		        do {
			 		        	
			 		            menu2();
			 		            opcao2 = entrada.nextInt();
			 		            
			 		            switch(opcao2){
			 		            
			 		            case 1:
			 		            	
			 			               System.out.println("\n#Preencha os dados corretamente");
			 	
			 			     		   System.out.print("Nome do Dono: ");
			 			     		   nomeDono = entrada.next();		     		   
			 			     		   
			 			     		   System.out.print("Número da Conta: ");
			 			     		   numConta = entrada.nextInt();
	
			 		
			 			     		   ce.abrirConta();   
			 			     		   ce.setNumConta(numConta);
			 			     		   ce.setNomeDono(nomeDono);
			 		               
			 		                break;
			 		                
			 		            case 2:
			 			        		
			 			        		if (c.getStatus() == true && saque < c.getSaldo()) {
			 			        			
			 			        			System.out.print("\nValor do Saque: ");
			 				                saque = entrada.nextDouble();
			 				                c.sacar(saque);
			 			        		
			 			        			break;
			 			        			
			 			        		} if (c.getSaldo() == 0){
			 			        			System.out.println("Atenção - Não há nada para sacar.");
			 			        		} else if (saque > c.getSaldo()){
			 			        			System.out.println("Atenção - Saque maior que saldo");
			 			        		} else if (c.getStatus() == false) {
			 			        			System.out.println("Atenção - Você precisa de uma conta aberta.");
			 		        			}
	
			 		                break;
			 		                
			 		            case 3:
			 		            	
			 		                if(c.getStatus()) {
			 		                	System.out.print("\nValor do Depósito: ");
			 			                deposito = entrada.nextDouble();
			 			                c.depositar(deposito);
			 		                } else{
			 		                	System.out.println("Atenção - Você precisa ter uma conta aberta");
			 		                }
			 		        
			 		                break;
			 		                
			 		            case 4:
			 		            	
			 		        		System.out.println("Dono: " + c.getNomeDono());
			 		        		System.out.println("Número: " + c.getNumConta());
			 		         		System.out.println("Salário Mensal: " + c.getSalarioMensal());
			 		        		System.out.println("Saldo: " + c.getSaldo());
			 		        		System.out.println("Valor do Saque: " + saque);
			 		        		System.out.println("Valor do Depósito: " + deposito);
	
			 		                break;
			 		               
			 		            case 5:
			 		            	
			 		            	c.fecharConta();
			 		        		System.out.println("Sua conta foi fechada!");
			 		        		
			 		                break;
			 		            
			 		            default:
			 		                System.out.println("Opção inválida.");
			 		            }
			 		        } while(opcao != 0);
			 		    }
			 	
		               
		                break;
		                 
		            case 3:
			        		
			        		if (c.getStatus() == true && saque < c.getSaldo()) {
			        			
			        			System.out.print("\nValor do Saque: ");
				                saque = entrada.nextDouble();
				                c.sacar(saque);
			        		
			        			break;
			        			
			        		} if (c.getSaldo() == 0){
			        			System.out.println("Atenção - Não há nada para sacar.");
			        		} else if (saque > c.getSaldo()){
			        			System.out.println("Atenção - Saque maior que saldo");
			        		} else if (c.getStatus() == false) {
			        			System.out.println("Atenção - Você precisa de uma conta aberta.");
		        			}

		                break;
		                
		            case 4:
		            	
		                if(c.getStatus()) {
		                	System.out.print("\nValor do Depósito: ");
			                deposito = entrada.nextDouble();
			                c.depositar(deposito);
		                } else{
		                	System.out.println("Atenção - Você precisa ter uma conta aberta");
		                }
		        
		                break;
		                
		            case 5:
		            	
		        		System.out.println("Dono: " + c.getNomeDono());
		        		System.out.println("Número: " + c.getNumConta());
		         		System.out.println("Salário Mensal: " + c.getSalarioMensal());
		        		System.out.println("Saldo: " + c.getSaldo());
		        		System.out.println("Valor do Saque: " + saque);
		        		System.out.println("Valor do Depósito: " + deposito);

		                break;
		               
		            case 6:
		            	
		            	c.fecharConta();
		        		System.out.println("Sua conta foi fechada!");
		        		
		                break;
		            
		            default:
		                System.out.println("Opção inválida.");
		            }
		        } while(opcao != 0);
		    }
	
}
