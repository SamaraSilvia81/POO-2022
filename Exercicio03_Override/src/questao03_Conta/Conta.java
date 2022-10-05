package questao03_Conta;

public interface Conta {
	
	public boolean abrirConta();
	public boolean fecharConta();
	public void depositar(double deposito);
	public void sacar(double saque);

}