package BASICO;

import java.util.Scanner;

public class maiorTres {

	public static void main(String[] args) {
		int valorUm;
		int valorDois;
		int valorTres;
		Scanner input = new Scanner(System.in);
		System.out.print("digite o valor um: ");
		valorUm = input.nextInt();
		System.out.print("digite o valor dois: ");
		valorDois = input.nextInt();
		System.out.print("digite o valor tres: ");
		valorTres = input.nextInt();
		if (valorUm>valorDois && valorUm>valorTres) {
			System.out.printf("%d foi o maior valor digitado",valorUm);
		} else if (valorDois>valorUm && valorDois>valorTres) {
			System.out.printf("%d foi o maior valor digitado",valorDois);
		}else if (valorTres>valorDois && valorTres>valorUm) {
			System.out.printf("%d foi o maior valor digitado",valorTres);
		}else {
			System.out.printf("%d, %d e %d são iguais",valorUm,valorDois,valorTres);
		}
	}

}
