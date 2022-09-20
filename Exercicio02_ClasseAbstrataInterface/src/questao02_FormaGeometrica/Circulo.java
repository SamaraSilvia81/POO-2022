package questao02_FormaGeometrica;

public class Circulo implements InterfaceGeometrica {

	private double pi = 3.14;
	private double raio;
	
	public Circulo(double raio) {	
		this.raio = raio;
	}

	public double area() {
		return (pi*(raio*raio));
	}

	public double perimetro() {
		return 2*pi*raio;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
}
