package questao03_Ingresso;

public class TesteIngresso {
	
	public static void main(String[] args) {
		
		Normal nor = new Normal(15);
		// nor.tipoDeIngresso();
		//System.out.println("Valor do Ingresso Normal: " + nor.imprimeValor());
		nor.Status();
		
		VIP vp = new VIP(15,5);
		// System.out.println("Valor do Ingresso VIP: " + vp.imprimeValor());
		System.out.println("--------");
		vp.Status();

		CamaroteInferior cf = new CamaroteInferior(15,7,"Camarote Inferior");
		System.out.println("--------");
		cf.Status();		

		CamaroteSuperior cs = new CamaroteSuperior(15,10,"Camarote Superior");
		System.out.println("--------");
		cs.Status();		
		
		
		
		
		
		
		
	}
}
