package questao02_Animal;

public class Gato extends Animal {
	
	private String nome;
	private String raca;
	private String caminha;
	
	public String mia() {
		return "Meown Meown";
	}

	public Gato(String nome, String raca, String caminha) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.caminha = caminha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCaminha() {
		return caminha;
	}

	public void setCaminha(String caminha) {
		this.caminha = caminha;
	}

	@Override
	public String caminha() {
		return caminha;
	}

	@Override
	public void animal(String nome) {
		super.animal(nome);
	}

	@Override
	public void Animal() {
		System.out.println("DADOS DO GATO");
		System.out.println("Nome: "  + getNome());
		System.out.println("Raça: "  + getRaca());
		System.out.println("Caminha? "  + getCaminha());
		System.out.println("O que o gato faz? " + mia());
	}
	
}
