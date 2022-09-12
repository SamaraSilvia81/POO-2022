package questao03_Ingresso;

public class Normal extends Ingresso {
	
	private String ingressoNormal = "Ingresso Normal";
	
	public Normal(double valor) {
		super(valor);
	}
	
	public void tipoDeIngresso() {
		System.out.println(ingressoNormal);
	}
	
	public void Status() {
		System.out.println("DADOS DO INGRESSO TIPO A");
		System.out.println("Tipo do Ingresso: " + ingressoNormal);
		System.out.println("Valor do ingresso: " + getValor());
	}
	

}
