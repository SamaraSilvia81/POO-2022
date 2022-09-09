package questao01;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
	Funcionario f = new Funcionario("Samara",4000);
	System.out.println("#Funcionário Padrão");
	f.exibeDados();
	
	System.out.println("\nModificação do salário...\n");
	System.out.println("- Salário Anual -");
	System.out.println("Sem aumento:" + f.ganhoAnual());
	f.addAumento(300);
	System.out.println("Com aumento:" + f.ganhoAnual());
	
	/*Assistente a = new Assistente("Samara",2000,1234);
	a.addAumento(500);
	a.ganhoAnual();
	a.exibeDados();*/
	
	AssistenteAdministrativo aa = new AssistenteAdministrativo("Duka",6000,2301,"noite");
	System.out.println("\n#Funcionário Administrativo");
	aa.exibeDados();
	System.out.println("Ganho Anual: " + aa.ganhoAnual());
	
	AssistenteTecnico at = new AssistenteTecnico("Eudes",3000,9870,500);
	System.out.println("\n#Funcionário Técnico");
	at.exibeDados();
	System.out.println("Ganho Anual: " + at.ganhoAnual());
		
	}
}
