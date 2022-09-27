package questao01_Funcionario;

public class AnalistaDeSistemas extends Funcionario {
	
	public AnalistaDeSistemas(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void aumentaSalario() {
		 System.out.println("Salário + 15%: " + (this.getSalario() * 15/100 + this.getSalario()));
	}
}
