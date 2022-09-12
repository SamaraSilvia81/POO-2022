package questao04_Imovel;

public class Imovel {
	
	private String endereco;
	private double preco;
	
	public Imovel(String endereco, double preco) {
		this.endereco = endereco;
		this.preco = preco;
	}

	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public double setPreco(double preco) {
		return this.preco = preco;
	}
	
	

}
