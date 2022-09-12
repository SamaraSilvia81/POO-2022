package questao01_Funcionario;

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
		this.setSalario(salario+aumento); // aqui � s� para adicionar
	}
	
	public double ganhoAnual() { // porque retorna um valor real.
		return this.salario*12;
	}
	
	public void exibeDados() {
		System.out.println("Nome: " + this.nome); // dentro da pr�pria classe voc� pode usar s� this.nome
		System.out.println("Salário: " + this.salario);
	}

}