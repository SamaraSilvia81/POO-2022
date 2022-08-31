package aula06;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		Cliente c = new Cliente (0, "Samara");
		Produto p = new Produto (0, "PC");
		Pedido ped = new Pedido (0, "20/08/2022", "Recife", 2000, p , c); // p - objeto produto e c - objeto cliente.
		
		System.out.println(" -- SISTEMA DE COMPRAS -- \n");
		System.out.println("Id do Pedido: " + ped.id);
		System.out.println("Data do Pedido: " + ped.data);
		System.out.println("Endereço do Pedido: " + ped.endereco);
		System.out.println("Valor do Pedido: " + ped.valor);
		System.out.println("\nId do Produto: " + ped.produtos.id);
		System.out.println("Nome do Produto: " + ped.produtos.nome);
		System.out.println("\nId do Cliente: " + ped.cliente.id);
		System.out.println("Nome do Cliente: " + ped.cliente.nome);
		
	}

}
