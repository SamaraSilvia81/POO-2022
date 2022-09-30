package questao02_Cliente;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		ClienteFidelizacao cf = new ClienteFidelizacao("Samara","Rua Porto Nacional",1000,2,"10/2023");
		ClienteFidelizacaoEspecial cfe = new ClienteFidelizacaoEspecial("Eudes","Dauphin",2000,3,"12/2024");
		
		System.out.println("DADOS DOS CLIENTES DA EMPRESA X");
		System.out.println("Nome: " + cf.getNome());
		System.out.println("Tipo de Cliente: Fidelização");
		System.out.println("Endereço: " + cf.getEndereco());
		System.out.println("Bônus: " + cf.getBonus());
		System.out.println("Valor da Compra: " + cf.getValor());
		System.out.println("Validade do Cartão: " + cf.getValidade());
		System.out.print("AdionaBonus: ");
		cf.adicionaBonus();
		
		
		
	}
}
