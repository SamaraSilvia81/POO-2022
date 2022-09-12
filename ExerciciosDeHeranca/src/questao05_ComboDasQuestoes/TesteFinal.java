package questao05_ComboDasQuestoes;

import java.util.Scanner;

import questao01_Funcionario.AssistenteAdministrativo;
import questao01_Funcionario.AssistenteTecnico;
import questao02_Animal.Cachorro;
import questao02_Animal.Gato;
import questao02_StatusFinanceiro.Miseravel;
import questao02_StatusFinanceiro.Pobre;
import questao02_StatusFinanceiro.Rica;
import questao03_Ingresso.CamaroteInferior;
import questao03_Ingresso.CamaroteSuperior;
import questao03_Ingresso.Normal;
import questao03_Ingresso.VIP;
import questao04_Imovel.Novo;
import questao04_Imovel.Velho;

public class TesteFinal {
	
	public static void tipoDoIngresso(){
	       
        System.out.println("\n0. Fim");
        System.out.println("1. Normal");
        System.out.println("2. VIP");
        System.out.println("3. Tipo do Camarote");
        System.out.print("Opcao:");
    }
	
	public static void ingressoVIP(){

        System.out.println("\n0. Fim");
        System.out.println("1. Camarote Inferior");
        System.out.println("2. Camarote Superior");
        System.out.print("Opcao:");
    }
	
	public static void tipoDoImovel(){
	       
        System.out.println("\n0. Fim");
        System.out.println("1. Antigo");
        System.out.println("2. Novo");
        System.out.print("Opcao:");
    }
	
	public static void main(String[] args) {
		
		System.out.println("#TESTES DA CLASSE FUNCIONÁRIO");
		
		AssistenteAdministrativo aa = new AssistenteAdministrativo("Bruna",5000,1301,"noite");
		aa.exibeDados();
		System.out.println("Função: Assistente Administrativo");
		System.out.println("Ganho Anual: " + aa.ganhoAnual());
		
		AssistenteTecnico at = new AssistenteTecnico("Sara",3000,5870,400);
		System.out.println("-----------------------");
		at.exibeDados();
		System.out.println("Função: Assistente Técnico");
		System.out.println("Ganho Anual: " + at.ganhoAnual());
			
		
		System.out.println("\n\n#TESTE DA ANIMAL");
		
		Cachorro dog = new Cachorro("Francis","Dobermann","Sim");
		dog.Animal();
		
		Gato cat = new Gato("Cleópatra","Sphynx","Sim");
		System.out.println("-----------------------");
		cat.Animal();
		
		
		
		System.out.println("\n\n#TESTES DA CLASSE PESSOA");
		
		Pobre poor = new Pobre("Karla",43);
		poor.Pessoa(poor.getNome() + " está envolvida com a máfia brasileira.");
		
		System.out.println("------------------");
		
		Miseravel paltry = new Miseravel("Carlos",17);
		paltry.Pessoa(paltry.getNome() + " está a beira da morte.");
		
		System.out.println("------------------");
		
		Rica rick = new Rica("Thomas",21,45000);
		rick.Pessoa(rick.getNome() + " é herdeiro de uma empresa britânica de finanças.");
	
		
		
		System.out.println("\n\n#TESTES DA CLASSE INGRESSO");

		Scanner entrada = new Scanner(System.in);
		
		 int opcao;

	        do{
	        	tipoDoIngresso();
	            opcao = entrada.nextInt();
	            
	            switch(opcao){
	            
	            case 0:
	            	
	            	System.out.println("Obrigada.Tchau!");
	            	
	                break;
	            	
	            case 1:
	        
	            	Normal nor = new Normal(15);
	            	nor.Status();
	               
	                break;
	                
	            case 2:
	            
	            	VIP vp = new VIP(15,5);
	        		vp.Status();
	
	                break;
	                
	            case 3:
	            	
	            	int opcao2;

        	        do{
        	        	ingressoVIP();
        	            opcao2 = entrada.nextInt();
        	            
        	            switch(opcao2){
        	            
        	            case 0:
        	            	
        	            	System.out.println("Obrigada.Tchau!");
        	            	
        	                break;
        	            	
        	            case 1:
        	            	
        	        		CamaroteInferior cf = new CamaroteInferior(15,7,"Camarote Inferior");
        	        		System.out.println(cf.getLocalizacao());
        	               
        	                break;
        	                
        	            case 2:
        	            	
        	            	CamaroteSuperior cs = new CamaroteSuperior(15,10,"Camarote Superior");
        	        		System.out.println(cs.getLocalizacaob2());
        	
        	                break;
        	                
        	            default:
        	                System.out.println("Opção inválida.");
        	            }
        	        } while(opcao2 != 0);
            		
		            
	            	/* if(opcao == 2) {
	            		
	            		int opcao2;

	        	        do{
	        	        	ingressoVIP();
	        	            opcao2 = entrada.nextInt();
	        	            
	        	            switch(opcao2){
	        	            case 1:
	        	            	
	        	        		CamaroteInferior cf = new CamaroteInferior(15,7,"Camarote Inferior");
	        	        		cf.Status();
	        	               
	        	                break;
	        	                
	        	            case 2:
	        	            	
	        	            	CamaroteSuperior cs = new CamaroteSuperior(15,10,"Camarote Superior");
	        	        		cs.Status();	
	        	
	        	                break;
	        	                
	        	            default:
	        	                System.out.println("Opção inválida.");
	        	            }
	        	        } while(opcao2 != 0);
	            		
	            	} else {
	            		System.out.println("É precico escolher um ingresso VIP primeiro!");
	            	}*/
	            		
	                break;

	            default:
	                System.out.println("Opção inválida.");
	            }
	        } while(opcao != 0);
		
		
	        
	        System.out.println("\n\n#TESTES DA CLASSE IMÓVEL");

			 int opcao3;

		        do{
		        	tipoDoImovel();
		            opcao3 = entrada.nextInt();
		            
		            switch(opcao3){
		            
		            case 0:
		            	
		            	System.out.println("Obrigada.Tchau!");
		            	
		                break;
		            	
		            case 1:
		        
		            	Novo young = new Novo("St. James’s Place, Westminster",10000,5000);
		        		System.out.println("Valor total: " + young.valorTotal());
		               
		                break;
		                
		            case 2:
		            
		            	Velho old = new Velho("Rua Porto Nacional ", 7000,1500);
		            	System.out.println("Valor total: " + old.valorTotal());
		
		                break;
		       
	        	                
    	            default:
    	                System.out.println("Opção inválida.");
    	            }
		            
    	        } while(opcao3 != 0);
	            		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
