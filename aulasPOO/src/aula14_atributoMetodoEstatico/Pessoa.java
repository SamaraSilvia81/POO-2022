package aula14_atributoMetodoEstatico;

public class Pessoa {

		private String nome;
		private int idade;
		
		public static int contador;
		
		// Não precisa de set e getter, porque eles são públicos.
		
		public Pessoa(String nome, int idade) {
			this.nome = nome;
			this.idade = idade;
			contador++;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public static int getContador() {
			return contador;
		}

		public static void setContador(int contador) {
			Pessoa.contador = contador;
		}
		
		
}
