package aula07;

public class Telefone {
	
	private int DDD;
	private int numeroTel;
	
	public Telefone() {
		DDD = 81;
		this.numeroTel = 994668775;
	}
	
	public Telefone(int dDD, int numeroTel) {
		DDD = dDD;
		this.numeroTel = numeroTel;
	}

	public int getDDD() {
		return DDD;
	}

	public void setDDD(int dDD) {
		DDD = dDD;
	}

	public int getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(int numeroTel) {
		this.numeroTel = numeroTel;
	}
	

}
