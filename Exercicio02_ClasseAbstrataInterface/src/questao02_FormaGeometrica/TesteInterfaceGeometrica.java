package questao02_FormaGeometrica;

public class TesteInterfaceGeometrica {
	
public static void main(String[] args) {
		
		Quadrado squad = new Quadrado(3,4);
		
		System.out.println("Área do Quadrado: " + squad.area());
		System.out.println("Perímetro do Quadrado: " + squad.perimetro());
		
		System.out.println("---------------");
		
		Circulo circle = new Circulo(4);
		
		System.out.println("Área do Círculo: " + circle.area());
		System.out.println("Perímetro do Quadrado: " + circle.perimetro());

	}
}
