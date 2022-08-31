package aula07;

/* Desafio de Associações: Fazer um sistema de cadastro de clientes, informando:
 * Cliente:
 * Data:
 * Endereço: 
 * Telefone:
*/

public class Cliente {
	
	private String nome;
	private String RG;
	private String CPF;
	private Endereco endereco;
	private Telefone telefone;
	private Data nascimento;
	
	public Cliente() {
		this.nome = "Samara Silvia";
		this.RG = "09.89.341";
		this.CPF = "234.456.789-23";
		this.telefone = new Telefone();
		this.nascimento = new Data();
		this.endereco = new Endereco();
	}
	
	public Cliente(String nome, String rG, String cPF, Data data, Telefone telefone,
			Endereco endereco) {
		
		this.nome = nome;
		this.RG = rG;
		this.CPF = cPF;
		this.telefone = telefone;
		this.nascimento = data;
		this.endereco = endereco;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	public Data getNascimento() {
		return nascimento;
	}
	public void setNascimento(Data nascimento) {
		this.nascimento = nascimento;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	

}
