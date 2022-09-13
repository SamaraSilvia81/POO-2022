package aula11_ClasseAbstrataFuncionario;

public abstract class FuncionarioAbstrato {
	
	private String nome;
	private double salario;

	public abstract void aumentaSalario();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
