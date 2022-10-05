package questao03_Conta;


public class ContaEspecial extends ContaBase  {

		// método construtor
		
		public ContaEspecial (int numConta, String nomeDono) {
			
			super(numConta,nomeDono);
			super.setStatus(false);
			super.setLimite((int)(Math.random()*super.getSalarioMensal()*3));
			super.setSaldo(super.getSalarioMensal());
			super.setSalarioMensal(super.getSalarioMensal());
		}

}
