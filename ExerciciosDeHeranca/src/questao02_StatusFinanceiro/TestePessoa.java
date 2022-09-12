package questao02_StatusFinanceiro;

public class TestePessoa {
	
	public static void main(String[] args) {
		
		Pobre poor = new Pobre("Márcia",24);
		poor.Pessoa("");
		
		System.out.println("------------------");
		
		Miseravel paltry = new Miseravel("Júlio",57);
		paltry.Pessoa("");
		
		System.out.println("------------------");
		
		Rica rick = new Rica("Samara",18,25000);
		rick.Pessoa("");
		
	}

}
