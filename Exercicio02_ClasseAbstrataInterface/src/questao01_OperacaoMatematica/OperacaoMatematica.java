package questao01_OperacaoMatematica;

public abstract class OperacaoMatematica {
	
	private int valorA;
	private int valorB;
	public abstract void calcula();
	
	public int getValorA() {
		return valorA;
	}
	public void setValorA(int valorA) {
		this.valorA = valorA;
	}
	public int getValorB() {
		return valorB;
	}
	public void setValorB(int valorB) {
		this.valorB = valorB;
	}
	
}
