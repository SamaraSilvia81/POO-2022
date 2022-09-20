package questao01_OperacaoMatematica;

public class Divisao extends OperacaoMatematica {
	
	private int results;

	@Override
	public void calcula() {
		results = this.getValorA() / this.getValorB();
		System.out.println("A divisão de " + getValorA() + " / " + getValorB() + " = " + results);
	}
}