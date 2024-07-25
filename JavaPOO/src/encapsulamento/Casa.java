package encapsulamento;

public class Casa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet g1 = new Pet();
		g1.ajustarNome("Sushi");
		g1.ajustarCor("Preto e branco"); 
		g1.ajustarTipo("Gato");
		g1.ajustarTamanho("Pequeno");
		g1.ajustarPadrinho("eitô");
		g1.ajustarSigno("Cancêr"); 
		g1.ajustarPeso(5);
		System.out.println(g1.lerNome());
		System.out.println(g1.lerCor());
		System.out.println(g1.lerTipo());
		System.out.println(g1.lerTamanho());
		System.out.println(g1.lerPadrinho());
		System.out.println(g1.lerSigno());
		System.out.println(g1.lerPeso());
	}

}
