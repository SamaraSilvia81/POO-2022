package questao02_StatusFinanceiro;

public class Rica extends Pessoa{
	
	private double dinheiro;
	
	public Rica(String nome, int idade, double dinheiro) {
		super(nome, idade);
		this.dinheiro = dinheiro;
	}
	
	public void fazCompras() {
		System.out.println(getNome() + " faz compras acima de 10000");
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

	@Override
	public void Pessoa(String adicional) {
		super.Pessoa(adicional);
		System.out.println("Status Financeiro: Rica");
		System.out.println("Dinheiro Total: " + getDinheiro());
		fazCompras();
	}

}
