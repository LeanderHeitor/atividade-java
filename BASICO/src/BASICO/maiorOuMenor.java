package BASICO;

import java.util.Scanner;

public class maiorOuMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int valor;
		System.out.print("digite um valor:");
		valor = input.nextInt();
		if (valor>0) {
			System.out.printf("%d é positivo ", valor);
		}else if (valor==0) {
			System.out.printf("%d é igual zero",valor);
		}else {
			System.out.printf("%d é negativo", valor);
		}
	}

}
