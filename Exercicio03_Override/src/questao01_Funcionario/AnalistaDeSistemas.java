package questao01_Funcionario;

public class AnalistaDeSistemas extends Funcionario {
	
	public AnalistaDeSistemas(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void aumentaSalario() {
		System.out.print("Sal�rio + 5%: ");
		super.aumentaSalario();
	}
}
