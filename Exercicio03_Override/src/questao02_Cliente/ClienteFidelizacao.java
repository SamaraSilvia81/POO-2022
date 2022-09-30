package questao02_Cliente;

public class ClienteFidelizacao extends Cliente {

	private double bonus;
	private String validade;
	
	public ClienteFidelizacao(String nome, String endereco, double valor, double bonus, String validade) {
		super(nome, endereco, valor);
		this.bonus = bonus;
		this.validade = validade;
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
	
	public void adicionaBonus() {
		this.setBonus(bonus + (this.getValor()*0.05));
	}
}
