package questao01_OperacaoMatematica;

public class TesteOperacaoMatematica {
	
	public static void main(String[] args) {
		
		Soma push = new Soma();
		push.setValorA(1);
		push.setValorB(2);
		push.calcula();
		
		System.out.println("----------");
		
		Subtracao subs = new Subtracao();
		subs.setValorA(5);
		subs.setValorB(2);
		subs.calcula();
		
		System.out.println("----------");
		
		Multiplicacao multi = new Multiplicacao();
		multi.setValorA(1);
		multi.setValorB(2);
		multi.calcula();
		
		System.out.println("----------");
		
		Divisao div = new Divisao();
		div.setValorA(4);
		div.setValorB(2);
		div.calcula();
		
		
		
	}
}
