package aula11_ClasseAbstrataAnimal;

public abstract class Animal {
	
	private String nome;
	private String raca;
	public abstract void seComunicar();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
}
