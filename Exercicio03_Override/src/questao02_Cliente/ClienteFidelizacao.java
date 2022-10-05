package questao02_Cliente;

public class ClienteFidelizacao extends Cliente {
	
	double compra, bonus;
	String validade;
	
	public ClienteFidelizacao(String nome, String endereco, InfoCliente info) {
		super(nome, endereco, info);
	}
	
	public double getCompra() {
		return compra;
	}

	public void setCompra(double compra) {
		this.compra = compra;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public double adicionaBonus(double compra) {
		return bonus = (compra * 0.05);
	}

}