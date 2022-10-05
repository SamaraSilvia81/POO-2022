package questao02_Cliente;

public abstract class Cliente {

		
		private String nome, endereco;
		private InfoCliente info;
		
		public Cliente(String nome, String endereco, InfoCliente info) {
			this.nome = nome;
			this.endereco = endereco;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

}
