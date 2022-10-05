package questao02_Cliente;

import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		InfoClientePF icpf = new InfoClientePF("111.222.333-44");
		InfoClientePJ icpj = new InfoClientePJ("999.888.777-66");
		
		ClienteFidelizacao cf = new ClienteFidelizacao("Samara", "Rua Porto Nacional", icpf);
		ClienteFidelizacaoEspecial cfe = new ClienteFidelizacaoEspecial("Marvel", "EUA", icpj);
		
		cf.setCompra(200);
		cfe.setCompra(400);
		
		System.out.println("Cliente Fideliza��o");
		System.out.println("Nome: " + cf.getNome());
		System.out.println("Endere�o: " + cf.getEndereco());
		System.out.println("Cpf: " + icpf.getCpf());
		System.out.println("Valor do b�nus: " + cf.adicionaBonus(cf.getCompra()));
		
		System.out.println("\nCliente Fideliza��o Especial");
		System.out.println("Nome: " + cfe.getNome());
		System.out.println("Endere�o: " + cfe.getEndereco());
		System.out.println("Cnpj: " + icpj.getCnpj());
		System.out.println("Valor do b�nus: " + cfe.adicionaBonus(cfe.getCompra()));
		
	}

}