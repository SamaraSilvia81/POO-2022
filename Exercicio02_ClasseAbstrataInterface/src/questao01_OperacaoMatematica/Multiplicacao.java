package questao01_OperacaoMatematica;

public class Multiplicacao extends OperacaoMatematica {
	
	private int results;

	@Override
	public void calcula() {
		results = this.getValorA() * this.getValorB();
		System.out.println("A multiplicação de " + getValorA() + " * " + getValorB() + " = " + results);
	}
}
