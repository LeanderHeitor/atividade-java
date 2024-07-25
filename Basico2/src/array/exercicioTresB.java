package array;

import java.util.Scanner;

public class exercicioTresB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = new int[11];
		int b [] = new int[11];
		int c [] = new int[11];
		int d [] = new int[11];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 11; i++) {
			System.out.println("informe o valor: ");
			a[i] = input.nextInt();
		}
		for (int i = 0; i < 11; i++) {
			System.out.println("informe o valor: ");
			b[i] = input.nextInt();
		}
		for (int i = 0; i < 11; i++) {
			System.out.println("informe o valor: ");
			c[i] = input.nextInt();
		}
		for (int i = 0; i < 11; i++) {
			System.out.println("informe o valor: ");
			d[i] = input.nextInt();
		}
		
	}

}
