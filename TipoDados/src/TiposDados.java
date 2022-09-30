import java.util.Scanner;

public class TiposDados {

	//nao existe tipo string, e sim class invólucro
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do aluno:");
		String nome= teclado.nextLine();
		//float nota=(float) 8.5;
		//printf ou format
		System.out.println("Digite a nota do aluno");
		float nota= teclado.nextFloat();
		
		System.out.printf("Nota: de %s é %.2f ",nome, nota);
	}
}
