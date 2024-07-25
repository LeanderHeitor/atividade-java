package basico3;

public class exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] texto = {"a","vida","é","bela"};
		for (int i = 0; i < texto.length; i++) {
			String str = texto[i] + " ";
			System.out.print(str.toUpperCase());
		}
		
		for (int y = texto.length -1; y >=0 ; y--) {
			System.out.print(texto[y].toUpperCase()+" ");
		}
	}

}
