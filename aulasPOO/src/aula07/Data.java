package aula07;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	public Data() {
		super();
		this.dia = 31;
		this.mes = 10;
		this.ano = 2003;
	}
	
	
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

}
