package questao02_FormaGeometrica;

public class TesteInterfaceGeometrica {
	
public static void main(String[] args) {
		
		Quadrado squad = new Quadrado(3,4);
		
		System.out.println("�rea do Quadrado: " + squad.area());
		System.out.println("Per�metro do Quadrado: " + squad.perimetro());
		
		System.out.println("---------------");
		
		Circulo circle = new Circulo(4);
		
		System.out.println("�rea do C�rculo: " + circle.area());
		System.out.println("Per�metro do Quadrado: " + circle.perimetro());

	}
}
