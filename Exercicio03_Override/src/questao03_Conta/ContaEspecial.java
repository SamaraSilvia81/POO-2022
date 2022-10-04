package questao03_Conta;

public class ContaEspecial implements Conta  {
		
		public int numConta;
		private double limit;
		private String nomeDono;
		private double saldo;
		private double salarioMensal = 2500;
		private boolean status; // conta aberta (true) ou fechada (false)

		// getters e setters

		public int getNumConta() {
			return numConta;
		}

		public void setNumConta(int numConta) {
			this.numConta = numConta;
		}

		public String getNomeDono() {
			return nomeDono;
		}

		public void setNomeDono(String nomeDono) {
			this.nomeDono = nomeDono;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public boolean getStatus() {
			return status;
		}

		public boolean setStatus(boolean status) {
			return this.status = status;
		}
		
		public double getLimit() {
			return limit;
		}
		
		public void setLimit(double limit) {
			this.limit = limit;
		}

		public double getSalarioMensal() {
			return salarioMensal;
		}

		public void setSalarioMensal(double salarioMensal) {
			this.salarioMensal = salarioMensal;
		}

		// m�todo construtor
		
		public ContaEspecial (int numConta, String nomeDono) {
			
			this.status = false;
			
			this.limit = (int)(Math.random()*salarioMensal*3);
			
			this.numConta = numConta;
			this.nomeDono = nomeDono;
			this.saldo = salarioMensal;
			this.salarioMensal = salarioMensal;
		}

		// m�todos

		@Override
		public boolean abrirConta() {
			return this.status = true;
		}

		@Override
		public boolean fecharConta() {
			return this.status = false;
		}

		@Override
		public void depositar(double deposito) {
			this.saldo = this.saldo + deposito;
		}

		@Override
		public void sacar(double saque) {
			
			if(getLimit() > getSalarioMensal()) {
				System.out.println("O saque não pode ser efetuado. Limite inferior!");
			} else {
				this.saldo -= saque; 
			}
		}
}
