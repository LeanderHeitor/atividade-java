package Rep1;

import java.util.Scanner;

public class exercicioTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota = 0, soma = 0, media;
		int qtdAlunos, i=1;
		Scanner input = new Scanner(System.in);
		System.out.print("quantos alunos tem em sua sala: ");
		qtdAlunos = input.nextInt();
		while (i<qtdAlunos+1) {
			System.out.println("adicionando nota "+ i);
			nota = input.nextDouble();
			soma = soma + nota;
			i = i+1;
			
		}
		System.out.println(nota);
		media = (soma/qtdAlunos);
		System.out.printf("a media da turma é de %.2f",media);
	}

}
