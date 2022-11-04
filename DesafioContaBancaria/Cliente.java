package DesafioJava;

public class Cliente {
	
	private String nome;
	private InfoCliente info;
	
	public Cliente(String nome,InfoCliente info) {
		this.nome = nome;
		this.info = info;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
