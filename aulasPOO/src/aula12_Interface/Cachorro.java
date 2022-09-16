package aula12_Interface;

public class Cachorro implements Animal {
	
	private String nome;
	private int idade;
	private String raca;
	
	public Cachorro(String nome, int idade, String raca) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
	}
	
	public void comer(String comida) {
		System.out.println("O gato está comendo " + comida);
	}
	
	public void pedigre(String raca) {
		System.out.println("Ele é um cachorro " + raca);
	}
	
	public void dormir() {
		System.out.println("Ele está dormindo");
	}

	public void acordar() {
		System.out.println("Ele está acordado");
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

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	
	
	


}
