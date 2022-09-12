package questao04_Imovel;

public class Velho extends Imovel {
	
	private double descontoVelho;

	public Velho(String endereco, double preco, double valorAdicionalVelho) {
		super(endereco, preco);
		this.descontoVelho = valorAdicionalVelho;
	}

	public double getdescontoVelho() {
		return descontoVelho;
	}

	public void setdescontoVelho(double valorAdicionalVelho) {
		this.descontoVelho = valorAdicionalVelho;
	}
	
	public double valorTotal() {
		return (super.getPreco() - getdescontoVelho());
	}

	public void Status() {
		System.out.println("DADOS DO ANTIGO ENDEREÇO");
		System.out.println("Endereço: " + getEndereco());
		System.out.println("Valor Descontado: " + getdescontoVelho());
		System.out.println("Valor Total: " + valorTotal());
	}


}
