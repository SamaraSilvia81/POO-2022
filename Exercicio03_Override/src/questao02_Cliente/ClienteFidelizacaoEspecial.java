package questao02_Cliente;

public class ClienteFidelizacaoEspecial extends ClienteFidelizacao {
	
	public ClienteFidelizacaoEspecial(String nome, String endereco, InfoCliente info) {
		super(nome, endereco, info);
	}
	
	@Override
	public double adicionaBonus(double compra) {
		return bonus = (compra * 0.10);
	}

}