package questao03_Ingresso;

public class VIP extends Ingresso {
	
	private double valorAdicional;

	public VIP(double valor, double valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}
	
	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public double imprimeValor() {
		return (super.imprimeValor() + getValorAdicional());	
	}
	
	public void Status() {
		System.out.println("DADOS DO INGRESSO TIPO B");
		System.out.println("Tipo do Ingresso: VIP");
		System.out.println("Valor adicional: " + getValorAdicional());
		System.out.println("Valor do ingresso: " + imprimeValor());
	}
	

}
