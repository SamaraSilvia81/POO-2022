package questao01_OperacaoMatematica;

public class Subtracao extends OperacaoMatematica {
	
	private int results;

	@Override
	public void calcula() {
		results = this.getValorA() - this.getValorB();
		System.out.println("A substra��o de " + getValorA() + " - " + getValorB() + " = " + results);
	}
}