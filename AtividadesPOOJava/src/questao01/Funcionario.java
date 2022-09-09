package questao01;

public class Funcionario {
	
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

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

	public void addAumento(double aumento) {  // precisa estar visivel a outras classes
		this.setSalario(salario+aumento); // aqui é só para adicionar
	}
	
	public double ganhoAnual() { // porque retorna um valor real.
		return this.salario*12;
	}
	
	public void exibeDados() {
		System.out.println("Nome: " + this.nome); // dentro da própria classe você pode usar só this.nome
		System.out.println("Salário: " + this.salario);
	}

}
