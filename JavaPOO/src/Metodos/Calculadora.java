package Metodos;

public class Calculadora {

	public static void main(String[] args) {
		CalcularMetodos calculo01 = new CalcularMetodos();
		int resposta = calculo01.somar(2, 5);
		int resposta2 = calculo01.somar(2, 5,6);
		int resposta3 = calculo01.subt(6, 3);
		int resposta4 = calculo01.subt(6, 3,1);
		int resposta5 = calculo01.mult(6, 3);
		int resposta6 = calculo01.mult(6, 3,2);
		int resposta7 = calculo01.div(6, 3);
		int resposta8 = calculo01.div(6, 3,2);
		System.out.println(resposta);
		System.out.println(resposta2);
		System.out.println(resposta3);
		System.out.println(resposta4);
		System.out.println(resposta5);
		System.out.println(resposta6);
		System.out.println(resposta7);
		System.out.println(resposta8);
		

	}

}
