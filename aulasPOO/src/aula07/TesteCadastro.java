package aula07;

public class TesteCadastro {
	
public static void main(String[] args) {
		
		System.out.println("LIBRARYCOMICS" + "\nCadastro de Clientes\n");
		
		Cliente c1 = new Cliente();
		
		System.out.println("#Cliente padrão");
		System.out.println("Nome: " + c1.getNome());
		System.out.println("RG: " + c1.getRG());
		System.out.println("CPF: " + c1.getCPF());
		System.out.println("Nascimento: " + c1.getNascimento().getDia() + "/" + c1.getNascimento().getMes() + "/" + c1.getNascimento().getAno());
		System.out.println("Telefone: " + c1.getTelefone().getDDD() + c1.getTelefone().getNumeroTel());
		System.out.println("Endereço: " + c1.getEndereco().getLogradouro() + "," + c1.getEndereco().getNumero() + "," +  c1.getEndereco().getBairro() + "," +  c1.getEndereco().getCidade() + "," +  c1.getEndereco().getEstado());
		
		// NOVOS CLIENTES 
		
		// Cliente 1
		
		Endereco end = new Endereco("Rua Severina Norte",45,"Boa Viagem","Recife","PE");
		Data dt = new Data(18,05,2003);
		Telefone tel = new Telefone(81,995288123);
		Cliente c2 = new Cliente("Eudes Clovis", "8.870.456", "345.876.908-23", dt, tel, end);
		
		System.out.println("\n#Cliente1");
		System.out.println("Nome: " + c2.getNome());
		System.out.println("RG: " + c2.getRG());
		System.out.println("CPF: " + c2.getCPF());
		System.out.println("Nascimento: " + c2.getNascimento().getDia() + "/" + c2.getNascimento().getMes() + "/" + c2.getNascimento().getAno());
		System.out.println("Telefone: " + c2.getTelefone().getDDD() + c2.getTelefone().getNumeroTel());
		System.out.println("Endereço: " + c2.getEndereco().getLogradouro() + "," + c2.getEndereco().getNumero() + "," +  c2.getEndereco().getBairro() + "," +  c2.getEndereco().getCidade() + "," +  c2.getEndereco().getEstado());
		
		// Cliente 1
		
		Endereco end2 = new Endereco("Rua Stanford Sul",12,"Boa Viagem","Recife","PE");
		Data dt2 = new Data(28,01,2003);
		Telefone tel2 = new Telefone(81,993558477);
		Cliente c3 = new Cliente("Maria Eduarda Souto", "9.786.540", "547.145.128-23", dt2, tel2, end2);
				
		System.out.println("\n#Cliente2");
		System.out.println("Nome: " + c3.getNome());
		System.out.println("RG: " + c3.getRG());
		System.out.println("CPF: " + c3.getCPF());
		System.out.println("Nascimento: " + c3.getNascimento().getDia() + "/" + c3.getNascimento().getMes() + "/" + c3.getNascimento().getAno());
		System.out.println("Telefone: " + c3.getTelefone().getDDD() + c3.getTelefone().getNumeroTel());
		System.out.println("Endereço: " + c3.getEndereco().getLogradouro() + "," + c3.getEndereco().getNumero() + "," +  c3.getEndereco().getBairro() + "," +  c3.getEndereco().getCidade() + "," +  c3.getEndereco().getEstado());
				
	}

}
