package questao01;

public class AssistenteTecnico extends Assistente {
	
	private double bonus;

	public AssistenteTecnico(String nome, double salario, int numMatricula, double bonus) {
		super(nome, salario, numMatricula);
		this.bonus = bonus;
	}

	@Override
	public double ganhoAnual() {
		return (super.ganhoAnual() + bonus)*12;
	}

}
