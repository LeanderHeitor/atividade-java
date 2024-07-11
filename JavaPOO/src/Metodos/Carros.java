package Metodos;

public class Carros {
	String cor;
	String modelo;
	double valor;
	boolean ligado = false;
	
	
	public Carros() {
		
	}
	public Carros (String cor) {
		this.cor = cor;
	}
	public Carros (String cor, String modelo) {
		this.cor = cor;
		this.modelo = modelo;
	}
	public Carros(String cor, String modelo, double valor) {
		this.cor = cor;
		this.modelo = modelo;
		this.valor = valor;
	}
	public void Ligar() {
		if (ligado == true) {
			System.out.printf("%s já está ligado", modelo);
		} else {
			System.out.printf("%s foi ligado", modelo);
			ligado = true;
		}
		}
		public void Desligar() {
			if (ligado == true) {
				System.out.printf("%s foi desligado", modelo);
				ligado = false;
			} else {
				System.out.printf("%s ja está desligado", modelo);
			}
		}
		public void Status() {
			if (ligado == true) {
				System.out.printf("%s está ligado", modelo);
			} else {
				System.out.printf("%s esta desligado", modelo);
			}
		}
}