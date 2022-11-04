package DesafioJava;

import java.util.Scanner;

public class Teste {
	
	public static void menu(){
	       
    	//System.out.println("\nChatBoot - O que deseja?");
        System.out.println("\n0. Fim");
        System.out.println("1. Criar");
        System.out.println("2. Sacar");
        System.out.println("3. Depositar");
        System.out.println("4. Status");
        System.out.print("Opcao:");
    }
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Conta c = new Conta();

		InfoPF icpf = new InfoPF();
		InfoPJ icnpj = new InfoPJ();
		
		String tipoConta = null;
		String tipoDono = null;
		String nomeDono;
		String CPF = null;
		String CNPJ = null;
		double saque = 0.0;
		double deposito = 0.0;
		int numConta;
		 
		int opcao;

	        System.out.println("\tConta Banc�ria");

	        do{
	            menu();
	            opcao = entrada.nextInt();
	            
	            switch(opcao){
	            case 1:
	            	
		               System.out.println("\n#Preencha os dados corretamente");
		     		   System.out.println("Conta Corrente - cc e Conta Poupan�a - cp\n");
		     		   
		     		   System.out.print("Tipo da Conta: ");
		     		   tipoConta = entrada.next();
		     		   
		     		   System.out.println("PF ou PJ");
		     		   System.out.print("Tipo do Dono: ");
		     		   tipoDono = entrada.next();	
		     		   
		     		  if ("PF".equals(tipoDono)) {
		  				System.out.println("Informe seu CPF: ");
		  				CPF = entrada.next();
			  		} else if ("PJ".equals(tipoDono)) {
			  			System.out.println("Informe seu CNPJ: ");
		  				CNPJ = entrada.next();
			  		}
		     		  
		     		   System.out.print("Nome do Dono: ");
		     		   nomeDono = entrada.next();
		     		   
		     		   System.out.print("N�mero da Conta: ");
		     		   numConta = entrada.nextInt();

		     		   //c.setTipo(tipoConta);
	
		     		   c.abrirConta(tipoConta);   
		     		   c.numConta = numConta;			     		   
		     		   c.setNomeDono(nomeDono);
		     		   icpf.setCpf(CPF);
		     		   icnpj.setCnpj(CNPJ);
	               
	                break;
	                
	            case 2:
		        		
		        		if (c.getStatus() == true && saque < c.getSaldo()) {
		        			
		        			System.out.print("\nValor do Saque: ");
			                saque = entrada.nextDouble();
			                c.sacar(saque);
		        		
		        			break;
		        			
		        		} if (saque > c.getSaldo()){
		        			System.out.println("Aten��o - Saque maior que saldo");
		        		} else if (c.getStatus() == false) {
		        			System.out.println("Aten��o - Voc� precisa de uma conta aberta.");
	        			}

	                break;
	                
	            case 3:
	            	
	                if(c.getStatus()) {
	                	System.out.print("\nValor do Dep�sito: ");
		                deposito = entrada.nextDouble();
		                c.depositar(deposito);
	                } else{
	                	System.out.println("Aten��o - Voc� precisa ter uma conta aberta");
	                }
	        
	                break;
	                
	            case 4:
	            	
	            	System.out.println("Tipo da Conta: " + c.getTipo());
	        		System.out.println("TipoDono: " + tipoDono);
	        		System.out.println("Nome do Dono: " + c.getNomeDono());
	        		System.out.println("CPF: " + icpf.getCpf());
	        		System.out.println("CNPJ: " + icnpj.getCnpj());
	        		System.out.println("Número: " + c.getNumConta());
	        		System.out.println("Saldo: " + c.getSaldo());
	        		System.out.println("Valor do Saque: " + saque);
	        		System.out.println("Valor do Depósito: " + deposito);
	        		System.out.println("Taxa Mensal: " + c.getTaxaMensal());

	                break;
	            
	            default:
	                System.out.println("Op��o inv�lida.");
	            }
	        } while(opcao != 0);
	    }
}