package questao03_Ingresso;

public class CamaroteInferior extends VIP {
	
	private String localizacao;

	public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
		super(valor, valorAdicional);
		this.localizacao = localizacao;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public String imprimeLocalizacao() {
		return this.localizacao;
	}

	public void Status() {
		System.out.println("DADOS DO INGRESSO TIPO B.1");
		System.out.println("Tipo do Ingresso: VIP");
		System.out.println("Localização: " + localizacao);
		System.out.println("Valor adicional: " + getValorAdicional());
		System.out.println("Valor do ingresso: " + imprimeValor());
	}


}
