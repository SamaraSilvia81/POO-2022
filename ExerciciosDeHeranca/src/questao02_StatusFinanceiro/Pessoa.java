package questao02_StatusFinanceiro;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void Pessoa(String adicional) {
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println(adicional);
	}

}
