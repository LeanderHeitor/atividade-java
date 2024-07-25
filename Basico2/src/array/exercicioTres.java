package array;

public class exercicioTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[11];
		for (int i = 10; i > 0; i--) {
			array[i]=i;
			System.out.println(array[i]);
		}
		
		int[] arrayDois = new int [11];
		for (int i = 1;i<11;i++) {
			arrayDois[i]=i+2;
			System.out.println(arrayDois[i]);
		}
	}

}
