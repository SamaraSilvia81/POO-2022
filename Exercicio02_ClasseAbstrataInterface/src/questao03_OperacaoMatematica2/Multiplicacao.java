package questao03_OperacaoMatematica2;

public class Multiplicacao implements OperacaoMatematica {
	
	private double valorA;
	private double valorB;
	private double results;
	
	public Multiplicacao(double valorA, double valorB) {
		this.valorA = valorA;
		this.valorB = valorB;
	}

	public double getValorA() {
		return valorA;
	}

	public void setValorA(double valorA) {
		this.valorA = valorA;
	}

	public double getValorB() {
		return valorB;
	}

	public void setValorB(double valorB) {
		this.valorB = valorB;
	}

	public double getResults() {
		return results;
	}

	public void setResults(double results) {
		this.results = results;
	}

	public void calcula() {
		results = this.getValorA() * this.getValorB();
		System.out.println("A multiplicação de " + getValorA() + " * " + getValorB() + " = " + results);
	}
}
