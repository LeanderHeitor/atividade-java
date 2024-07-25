package BASICO;

import java.util.Scanner;

public class semana {

	public static void main(String[] args) {
		int valor;
		Scanner input = new Scanner(System.in);
		System.out.print("digite um valor: ");
		valor = input.nextInt();
		if (valor==1) {
			System.out.printf("domingo");
		} else if (valor == 2) {
			System.out.printf("segunda");
		} else if (valor == 3) {
			System.out.printf("terça");
		} else if (valor == 4) {
			System.out.printf("quarta");
		} else if (valor == 5) {
			System.out.printf("quinta");
		} else if (valor == 6) {
			System.out.printf("sexta");
		} else if (valor == 7) {
			System.out.printf("sabado");
		}else {
			System.out.println("valor invalido");
		}
	}

}
