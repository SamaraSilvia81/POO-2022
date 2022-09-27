package questao01_Funcionario;

public class Gerente extends Funcionario {
	
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void aumentaSalario() {
		 System.out.println("Salário + 5%: " + (this.getSalario() * 5/100 + this.getSalario()));
	}
}
