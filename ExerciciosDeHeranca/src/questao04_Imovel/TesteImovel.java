package questao04_Imovel;

public class TesteImovel {
	
	public static void main(String[] args) {
		
		Novo young = new Novo("St. James’s Place, Westminster",10000,5000);
		young.Status();
		
		System.out.println("-----------------");
		Velho old = new Velho("Rua Porto Nacional ", 7000,1500);
		old.Status();
		
	}
}
