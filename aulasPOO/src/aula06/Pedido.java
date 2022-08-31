package aula06;

public class Pedido {
	
	int id;
	String data;
	String endereco;
	double valor;
	Produto produtos;
	Cliente cliente;  // refer�ncia, porque sei que para cada pedido haver� algum cliente.
	
	public Pedido (int id, String data, String endereco, 
	           double valor, Produto produtos, Cliente cliente) {
		
		this.id = id;
		this.data = data;
		this.endereco = endereco;
		this.valor = valor;
		this.produtos = produtos;
		this.cliente = cliente;
		
	}

}
