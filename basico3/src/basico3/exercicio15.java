package basico3;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("digite o texto pra tirar o espaço do fim e do inicio");
		String str = input.nextLine();
		String resultado = str.trim();
		System.out.println(resultado);
		
	}

}
