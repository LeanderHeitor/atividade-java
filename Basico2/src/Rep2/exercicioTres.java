package Rep2;

public class exercicioTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			if (i>50 && i<60) {
				continue;
				//ignora todos os numeros entre 50 e 60
			}
			System.out.println(i);
		}
	}

}
