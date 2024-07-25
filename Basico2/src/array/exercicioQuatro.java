package array;

import java.util.Iterator;
import java.util.Scanner;


public class exercicioQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double total=0,media = 0, notas [] = new double[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("digite a nota: ");
			notas[i] = input.nextDouble();
		}
		for (double n : notas) {
			total +=n;
			
		}
		System.out.println(total);
		 media = total/notas.length;
		System.out.printf("a media é de %.2f",media);
	}

}
