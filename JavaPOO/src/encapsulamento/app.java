package encapsulamento;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Retangulo r1 = new Retangulo(2, 4);
		r1.area();
		System.out.println("qual a altura?");
		r1.setAltura(input.nextDouble());
		System.out.println("qual a base?");
		r1.setBase(input.nextDouble());
		r1.area();
	}

}
