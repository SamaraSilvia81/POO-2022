package aula04;

public class Cliente {
	
	public int id;
	private String nome;
	protected String endereco;
	
	public Cliente() {
		this.id = 0;
		this.nome = "Samara";
		this.endereco = "Rua";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

}
