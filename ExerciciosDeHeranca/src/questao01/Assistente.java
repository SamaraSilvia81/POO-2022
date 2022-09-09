package questao01;

public class Assistente extends Funcionario {
	
	private int numMatricula;

	public Assistente(String nome, double salario, int numMatricula) {
		super(nome, salario); // herdados da superClasse (funcion�rio)
		this.numMatricula = numMatricula;
		
		// a ordem dos argumentos importa no super - invoca o construtor da superClasse -
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	@Override   // polimorfismo
	public void exibeDados() {
		super.exibeDados();
		System.out.println("N�mero de Matr�cula: " + this.numMatricula);
	}
	
	
	

}
