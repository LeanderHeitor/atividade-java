package Metodos;

public class aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carros c1 = new Carros();
		Carros c4 = new Carros("Azul","Fusca", 30000);
		Carros c3 = new Carros("Amarelo", "Camaro");
		Carros c2 = new Carros("Azul");
		c1.cor = "Branco";
		System.out.println(c1.cor + " " + c1.modelo + " " + c1.valor);
		System.out.println(c2.cor + " " + c2.modelo + " " + c2.valor);
		System.out.println(c3.cor + " " + c3.modelo + " " + c3.valor);
		System.out.println(c4.cor + " " + c4.modelo + " " + c4.valor);
		
		System.out.printf("o carro modelo %s é %s e custa %.2f",c4.modelo,c4.cor, c4.valor);
		System.out.println();
		c4.Ligar();
		System.out.println();
		c4.Status();
		System.out.println();
		c4.Ligar();
		System.out.println();
		c4.Desligar();
		System.out.println();
		c4.Status();
		System.out.println();
		c4.Desligar();
		System.out.println();
		c4.Ligar();
	
	}

}
