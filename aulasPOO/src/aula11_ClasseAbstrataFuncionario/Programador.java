package aula11_ClasseAbstrataFuncionario;

public class Programador extends FuncionarioAbstrato {
	
	@Override
	public void aumentaSalario() {
		System.out.println(getSalario() + 20);
	}

}

