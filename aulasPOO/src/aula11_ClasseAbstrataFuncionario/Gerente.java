package aula11_ClasseAbstrataFuncionario;

public class Gerente extends FuncionarioAbstrato {

	public void aumentaSalario() {  
		 System.out.println(getSalario()+10);
	}
	
	// N�o precisa sobrescrever, porque n�o h� nada na outra classe.

}