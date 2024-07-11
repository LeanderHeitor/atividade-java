package JavaPOO;

public class ClassePessoa {
String nome;
boolean comendo = false, andando = false, falando;
public void comer() {
	if (andando==true) {
		System.out.printf(" %s não pode comer, ele está andando",nome);
	}else if (comendo == false){
		System.out.printf(" %s foi comer ",nome);
		comendo = true;
	}else {
		System.out.printf(" %s já está comendo ",nome);
	}
	
}
public void pararDeComer() {
	if (comendo==false) {
		System.out.printf(" %s já não está comendo",nome);
	}else {
		System.out.printf(" %s parou de comer",nome);
		comendo = false;
	}
	
}
public void andar() {
	if (andando == false && comendo == false) {
		System.out.printf(" %s foi andar",nome);
		andando = true;
	}else if (comendo == true) {
		System.out.printf(" %s está comendo e não pode andar",nome);
	}else {
		System.out.printf(" %s já esta andando",nome);
	}
	
}
public void pararDeAndar() {
	if (andando == false) {
		System.out.printf(" %s já não está andando",nome);
	}else {
		System.out.printf(" %s parou de andar",nome);
		andando = false;
	}
}
public void falar() {
	if (andando == false && comendo == false) {
		System.out.printf(" %s foi andar",nome);
		andando = true;
	}else if (comendo == true) {
		System.out.printf(" %s está comendo e não pode andar",nome);
	}else {
		System.out.printf(" %s já esta andando",nome);
	}
	}
}