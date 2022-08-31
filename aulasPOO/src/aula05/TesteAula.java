package aula05;

public class TesteAula {
	
public static void main(String[] args) {
		
		Aula progOrientadaObjetos = new Aula("POO", "Iago Richard", 1024, "AB-CD",10.0,true);
		Aula frontEnd = new Aula("Programação Front-End", "Marcio Bueno", 3098, "EF-GH",9.75,false);
		Aula designThinking = new Aula("Design Thinking", "Christine Quaresma", 4567,"IJ-KL",8.5, true);
		
		// System.out.println(a.nome); // Erro de acesso, porque é privado.
		// System.out.println(a.codigo); // Erro de acesso, porque é privado.
		// a.nome = "lógico"; // não se pode sobrescrever atributos privados. Para mudar faz set.
		// a.codigo = 1005; // não se pode sobrescrever atributos privados.  Para mudar faz set.
		
		System.out.println("QUADRO DE HORÁRIOS - 3° PERÍODO - SISTEMA PARA INTERNET");
		System.out.println("Usuário: Eleanor Park Jhonson");
		System.out.println("");
		
		System.out.println("Disciplina: " + progOrientadaObjetos.getNome());
		System.out.println("Professor: " + progOrientadaObjetos.getProfessor());
		System.out.println("Código: " + progOrientadaObjetos.getCodigo());
		System.out.println("Horário: " + progOrientadaObjetos.getHorario());
		System.out.println("Media: " + progOrientadaObjetos.getMedia());
		System.out.println("Alunos estão presente? " + progOrientadaObjetos.getEhPresente());
		
		System.out.println("");
		
		System.out.println("Disciplina: " + frontEnd.getNome());
		System.out.println("Professor: " + frontEnd.getProfessor());
		System.out.println("Código: " + frontEnd.getCodigo());
		System.out.println("Horário: " + frontEnd.getHorario());
		System.out.println("Media: " + frontEnd.getMedia());
		System.out.println("Alunos estão presente? " + frontEnd.getEhPresente());
		
		System.out.println("");
		
		System.out.println("Disciplina: " + designThinking.getNome());
		System.out.println("Professor: " + designThinking.getProfessor());
		System.out.println("Código: " + designThinking.getCodigo());
		System.out.println("Horário: " + designThinking.getHorario());
		System.out.println("Media: " + designThinking.getMedia());
		System.out.println("Alunos estão presente? " + designThinking.getEhPresente());
		
		System.out.println("");
		
		// atualizando dados da discilina de design
		
		designThinking.setNome("Lógica");
		designThinking.setProfessor("Samara Silvia");
		designThinking.setCodigo(1005);
		designThinking.setHorario("MN-OP");
		designThinking.setMedia(9.8);
		designThinking.setEhPresente(false);

		System.out.println("// Dados da Disciplina de Design Thinking atualizada // ");
		System.out.println(" ");
		
		System.out.println("Disciplina: " + designThinking.getNome());
		System.out.println("Professor: " + designThinking.getProfessor());
		System.out.println("Código: " + designThinking.getCodigo());
		System.out.println("Horário: " + designThinking.getHorario());
		System.out.println("Media: " + designThinking.getMedia());
		System.out.println("Alunos estão presentes " + designThinking.getEhPresente());
			
	}

}
