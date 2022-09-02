package aula08;

public class ClientePessoaFisica extends Cliente {
	
	private String cpf;
	
	public ClientePessoaFisica(String nome, String endereco, String cpf) {
		
		super(nome,endereco); // � um set para superClasse;
		this.cpf = cpf;
	}
	
	public ClientePessoaFisica() {
		super("Loki","Asgard"); // � um set para superClasse;
		this.cpf = "123.456.789.09";
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
