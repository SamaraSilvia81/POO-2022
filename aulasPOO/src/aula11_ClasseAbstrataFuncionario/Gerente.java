package aula11_ClasseAbstrataFuncionario;

public class Gerente extends FuncionarioAbstrato {

	public void aumentaSalario() {  
		 System.out.println(getSalario()+10);
	}
	
	// Não precisa sobrescrever, porque não há nada na outra classe.

}