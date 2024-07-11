package Membros;

public class UsoMembros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataNascimento dt = new DataNascimento();
		DataNascimento dt2 = new DataNascimento();
		dt.dia = 25;
		dt.mes=06;
		dt.ano=2004;
		dt2.dia=24;
		dt2.mes=12;
		dt2.ano=2005;
		System.out.printf("a data de nascimento " + "é %d %d %d",dt.dia,dt.mes,dt.ano);
		System.out.println();
		System.out.printf("a data de nascimento " + "é %d %d %d",dt2.dia,dt2.mes,dt2.ano);
	}

}
