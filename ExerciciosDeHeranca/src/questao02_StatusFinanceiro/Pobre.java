package questao02_StatusFinanceiro;

public class Pobre extends Pessoa {
	
	public Pobre(String nome, int idade) {
		super(nome, idade);
	}

	public void trabalha() {
		System.out.println(getNome() + " trabalha como faz tudo");
	}

	@Override
	public void Pessoa(String adicional) {
		super.Pessoa(adicional);
		System.out.println("Status Financeiro: Pobre");
		trabalha();
	}

}
