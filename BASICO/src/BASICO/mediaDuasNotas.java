package BASICO;

import java.util.Scanner;

public class mediaDuasNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double notaUm;
		double notaDois;
		double media;
		Scanner input = new Scanner(System.in);
		System.out.print("digite a primeira nota: ");
		notaUm = input.nextDouble();
		System.out.print("digite a segunda nota: ");
		notaDois = input.nextDouble();
		media = (notaUm + notaDois)/2;
		System.out.printf("a media de %.2f e %.2f é de %.2f",notaUm,notaDois,media);
	}

}
