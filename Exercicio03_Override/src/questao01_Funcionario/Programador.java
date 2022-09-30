package questao01_Funcionario;

public class Programador extends Funcionario {
	
	public Programador(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void aumentaSalario() {
		System.out.println("Salário + 20%: " + (super.getSalario() * 20/100 + super.getSalario()));
	}

}
