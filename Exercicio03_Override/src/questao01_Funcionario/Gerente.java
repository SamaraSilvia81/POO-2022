package questao01_Funcionario;

public class Gerente extends Funcionario {
		
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void aumentaSalario() {
		System.out.println("Salário + 10%: " + (super.getSalario() * 10/100 + super.getSalario()));
		super.setSalario(super.getSalario() * 10/100 + super.getSalario());
	}
}
