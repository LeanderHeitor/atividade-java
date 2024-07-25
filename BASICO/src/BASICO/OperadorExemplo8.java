package BASICO;

import java.util.Scanner;

public class OperadorExemplo8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade;
		String nome;
		
		System.out.print("digite seu nome: ");
		nome = entrada.nextLine();
		System.out.print("digite sua idade: ");
		idade = entrada.nextInt();
		System.out.println("nome: " + nome + " " +"idade:" + idade);
		System.out.printf("Nome: %S idade: %d",nome,idade);
	}

}
