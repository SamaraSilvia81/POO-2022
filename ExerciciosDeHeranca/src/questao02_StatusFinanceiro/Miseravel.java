package questao02_StatusFinanceiro;

public class Miseravel extends Pessoa {

	public Miseravel(String nome, int idade) {
		super(nome, idade);
	}

	public void mendiga() {
		System.out.println(getNome() + " leva a vida de mendigagem");
	}

	@Override
	public void Pessoa(String adicional) {
		super.Pessoa(adicional);
		System.out.println("Status Financeiro: Miserável");
		mendiga();
	}


}
