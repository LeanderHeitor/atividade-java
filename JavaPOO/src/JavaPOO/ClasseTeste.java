package JavaPOO;

public class ClasseTeste {

	public static void main(String[] args) {
		ClassePessoa aluno01 = new ClassePessoa();
		aluno01.nome = "eitô";
		aluno01.comer();
		System.out.println();
		ClassePessoa aluno02 = new ClassePessoa();
		aluno02.nome = "Xamuel";
		aluno02.comer();
		System.out.println();
		aluno02.pararDeComer();
		System.out.println();
		aluno02.andar();
		System.out.println();
		aluno02.pararDeAndar();
		System.out.println();
		aluno02.comer();
		System.out.println();
		aluno02.comer();
		System.out.println();
		aluno02.andar();
		System.out.println();
		aluno02.pararDeComer();
		System.out.println();
		aluno02.andar();
		System.out.println();
		aluno02.comer();
	}

}
