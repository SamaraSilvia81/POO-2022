package aula14_atributoMetodoEstatico;

public class Teste02 {
	
	public static void main(String[] args) {
		
	// H� duas formas de acessar o valor da classe Circulo;
		
		ContantesMatematicas c = new ContantesMatematicas();
		System.out.println(c.PI);
		
		System.out.println(ContantesMatematicas.PI); // aqui n�o precisa instanciar, porque � static.
		
	}
}
