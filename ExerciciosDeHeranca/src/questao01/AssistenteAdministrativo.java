package questao01;

public class AssistenteAdministrativo extends Assistente {
	
	private String turno;

	public AssistenteAdministrativo(String nome, double salario, int numMatricula, String turno) {
		super(nome, salario, numMatricula);
		this.turno = turno;
	}

	@Override
	public double ganhoAnual() {
		
		if(this.turno.equalsIgnoreCase("noite")) { // para comparar valores de string use equals.
			return (super.ganhoAnual() + 1000)*12;
		} else {
			return getSalario()*12; 
		}

	}
	
}
