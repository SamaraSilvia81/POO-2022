package questao03_Ingresso;

public class CamaroteSuperior extends VIP {
	
	private double valorAdicionalCS;
	private String localizacaob2;
	
	public CamaroteSuperior(double valor, double valorAdicionalCS, String localizacao) {
		super(valor,valorAdicionalCS);
		this.valorAdicionalCS = valorAdicionalCS;
		this.localizacaob2 = localizacao;
	}

	public double imprimeValorCS() {
		return (super.imprimeValor() + getValorAdicionalCS());	
	}

	public double getValorAdicionalCS() {
		return valorAdicionalCS;
	}

	public void setValorAdicionalCS(double valorAdicionalCS) {
		this.valorAdicionalCS = valorAdicionalCS;
	}
	
	public String imprimeLocalizacao() {
		return this.localizacaob2;
	}
	
	public String getLocalizacaob2() {
		return localizacaob2;
	}

	public void setLocalizacaob2(String localizacaob2) {
		this.localizacaob2 = localizacaob2;
	}

	public void Status() {
		System.out.println("DADOS DO INGRESSO TIPO B.2");
		System.out.println("Tipo do Ingresso: VIP");
		System.out.println("Localização: " + getLocalizacaob2());
		System.out.println("Valor adicional: " + getValorAdicionalCS());
		System.out.println("Valor total: " + imprimeValorCS());
	}


	

}
