package aula05;

public class Aula {
	
	private String nome;
	private String professor;
	private int codigo;
	private String horario;
	private double media;
	private boolean ehPresente;
	
	public Aula (String nome, String professor, int codigo, String horario, double media, boolean ehPresente) {
		this.nome = nome;
		this.professor = professor;
		this.codigo = codigo;
		this.horario = horario;
		this.media = media;
		this.ehPresente = ehPresente;
	}
	
	
	// nome
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;  // para setar fazemos isso. Nome é o que vamos usar como argumento.
	}
	
	
	// professor
	
	public String getProfessor() {
		return this.professor;
	}
	
	public void setProfessor(String professor) {
		this.professor = professor; 
	}
	
	
	// codigo
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	// horario 
	
	public String getHorario() {
		return this.horario;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
	// media
	
	public double getMedia() {
		return this.media;
	}
	
	public void setMedia(double media) {
		this.media = media;
	}
	
	
	// ehPresente
	
	public boolean getEhPresente() {
		return this.ehPresente;
	}
	
	public void setEhPresente(boolean ehPresente) {
		this.ehPresente = ehPresente; 
	}

}
