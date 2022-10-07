package aula14_atributoMetodoEstatico;

public class TestePessoa {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Samara",18);
		
		System.out.println("SISTEMA DE CADASTRO\n");
		
		System.out.println("Nome do Usu�rio A: " + p1.getNome());
		System.out.println("Idade do Usu�rio A: " + p1.getIdade());
		System.out.println("N�mero de Usu�rios Criados: " + Pessoa.contador);
		
		Pessoa p2 = new Pessoa("Eudes",19);
		
		System.out.println("\nNome do Usu�rio B: " + p2.getNome());
		System.out.println("Idade do Usu�rio A: " + p2.getIdade());
		System.out.println("N�mero de Usu�rios Criados: " + Pessoa.contador);
		
		Pessoa p3 = new Pessoa("Loki",2000);
		
		System.out.println("\nNome do Usu�rio B: " + p3.getNome());
		System.out.println("Idade do Usu�rio A: " + p3.getIdade());
		System.out.println("N�mero de Usu�rios Criados: " + Pessoa.contador);
		
		Pessoa p4 = new Pessoa("Arlequina",30);
		
		System.out.println("\nNome do Usu�rio B: " + p4.getNome());
		System.out.println("Idade do Usu�rio A: " + p4.getIdade());
		System.out.println("N�mero de Usu�rios Criados: " + Pessoa.contador);
		
		Pessoa p5 = new Pessoa("Wanda",32);
		
		System.out.println("\nNome do Usu�rio B: " + p5.getNome());
		System.out.println("Idade do Usu�rio A: " + p5.getIdade());
		System.out.println("N�mero de Usu�rios Criados: " + Pessoa.contador);
		
		
		// System.out.println(p1.contador); 
		// n�o faz sentido limitar o acesso de contador apenas uma �nica inst�ncia, 
		// podendo compartilhar com v�rias.
		
	
	}
}
