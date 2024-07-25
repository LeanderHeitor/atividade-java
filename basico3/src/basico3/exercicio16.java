package basico3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("digite o texto pra ser contado");
		StringTokenizer exemplo = new StringTokenizer(input.nextLine());
		System.out.println(exemplo.countTokens());
	}

}
