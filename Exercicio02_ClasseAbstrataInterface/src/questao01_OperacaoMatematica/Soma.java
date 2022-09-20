package questao01_OperacaoMatematica;

public class Soma extends OperacaoMatematica {
	
	private int results;

	@Override
	public void calcula() {
		results = this.getValorA() +  this.getValorB();
		System.out.println("A soma de " + getValorA() + " + " + getValorB() + " = " + results);
	}
}
