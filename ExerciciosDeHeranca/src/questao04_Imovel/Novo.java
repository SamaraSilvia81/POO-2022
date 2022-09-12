package questao04_Imovel;

public class Novo extends Imovel {
	
	private double valorAdicionalNovo;

	public Novo(String endereco, double preco, double valorAdicionalNovo) {
		super(endereco, preco);
		this.valorAdicionalNovo = valorAdicionalNovo;
	}

	public double getValorAdicionalNovo() {
		return valorAdicionalNovo;
	}

	public void setValorAdicionalVelho(double valorAdicionalNovo) {
		this.valorAdicionalNovo = valorAdicionalNovo;
	}
	
	public double valorTotal() {
		return (super.getPreco() + getValorAdicionalNovo());
	}
	
	public void Status() {
		System.out.println("DADOS DO NOVO ENDEREÇO");
		System.out.println("Endereço: " + getEndereco());
		System.out.println("Valor Adicional: " + getValorAdicionalNovo());
		System.out.println("Valor Total: " +  valorTotal());
	}


}
