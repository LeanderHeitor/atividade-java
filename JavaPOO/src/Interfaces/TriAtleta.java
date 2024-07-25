package Interfaces;

public class TriAtleta implements Ciclista, Nadador, Corredor{
	String nome;
	boolean descansando = false, correndo = false, nadando = false, pedalando = false, parado = true;
	@Override
	public void Descanso() {
		if  (correndo == true) {
			System.out.println("não pode descansar %s, está correndo");
		}
		else if  (nadando == true) {
			System.out.println("não pode descansar %s, está nadando");
		}
		else if  (pedalando == true) {
			System.out.println("não pode descansar %s, está nadando");
		}
		else if  (descansando == true) {
			System.out.println("não pode descansar %s, pois ele já está descansando");
		}
		
		else {
			System.out.printf("%s foi descansar",nome);
			descansando=true;
		}
		// TODO Auto-generated method stub
	}

	@Override
	public Void Correr() {
		if  (descansando == true) {
			System.out.println("não pode correr, %s está descansando");
		}
		else if  (nadando == true) {
			System.out.println("não pode correr, %s está nadando");
		}
		else if  (pedalando == true) {
			System.out.println("não pode correr, %s está pedalando");
		}
		else if  (correndo == true) {
			System.out.println("não pode correr, %s já está correndo");
		}
		
		else {
			System.out.printf("%s foi correr",nome);
			correndo=true;
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void Nadar() {
		if  (descansando == true) {
			System.out.println("não pode nadar, %s está descansando");
		}
		else if  (nadando == true) {
			System.out.println("não pode nadar, %s já está nadando");
		}
		else if  (pedalando == true) {
			System.out.println("não pode nadar, %s está pedalando");
		}
		else if  (correndo == true) {
			System.out.println("não pode nadar, %s está correndo");
		}
		
		else {
			System.out.printf("%s foi correr",nome);
			correndo=true;
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void Pedalar() {
		if  (descansando == true) {
			System.out.println("não pode pedalar, %s está descansando");
		}
		else if  (nadando == true) {
			System.out.println("não pode pedalar, %s está nadando");
		}
		else if  (pedalando == true) {
			System.out.println("não pode pedalar, %s já está descansando");
		}
		else if  (correndo == true) {
			System.out.println("não pode pedalar, %s está correndo");
		}
		
		else {
			System.out.printf("%s foi correr",nome);
			correndo=true;
		}
		return null;
	}
	public void nome (String nome) {
		this.nome = nome;
	}


}
