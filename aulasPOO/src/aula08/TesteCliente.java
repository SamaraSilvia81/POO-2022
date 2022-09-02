package aula08;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		
		System.out.println("#SISTEMA COM HERANÇA");
		
		System.out.println();		
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Endereço: " + c1.getEndereco());
		
		ClientePessoaFisica cf = new ClientePessoaFisica();
		
		System.out.println("\n#Cliente Pessoa Física");		
		System.out.println("NomeFisico: " + cf.getNome());
		System.out.println("Endereço: " + cf.getEndereco());
		System.out.println("CPF: " + cf.getCpf());
		
		ClientePessoaFisica cf2 = new ClientePessoaFisica("Tom Hiddleston", "Inglaterra", "567.543.786.-09");
		System.out.println("\n#Cliente Pessoa Física2");	
		System.out.println("NomeFisico: " + cf2.getNome());
		System.out.println("Endereço: " + cf2.getEndereco());
		System.out.println("CPF: " + cf2.getCpf());
				
		ClientePessoaJuridica cj = new ClientePessoaJuridica();
		
		System.out.println("\n#Cliente Pessoa Jurídica");		
		System.out.println("NomeJuridico: " + cj.getNome());
		System.out.println("Endereço: " + cj.getEndereco());
		System.out.println("CNPJ: " + cj.getCnpj());
		
		
		
		
	}
}
