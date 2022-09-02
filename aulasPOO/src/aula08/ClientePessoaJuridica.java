package aula08;

public class ClientePessoaJuridica extends Cliente {
	
	private String cnpj;
	
    public ClientePessoaJuridica(String nome, String endereco, String cnpj) {
		
		super(nome,endereco); // é um set para superClasse;
		this.cnpj = cnpj;
		
	}
    
    public ClientePessoaJuridica() {
		super("Marvel","Disney"); // é um set para superClasse;
		this.cnpj = "987.654.321.09";
	}


	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

    
}
