import java.util.Scanner;

public class CondicaoCompostaEncadeada {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("Informe sua data de nascimento:");
		int nasc= teclado.nextInt();
		int i=2022-nasc;
		if(i<16) {
			System.out.println("Nao vota");
		}else {
			if((i>=16 && i<18)|| (i>70)){
				System.out.println("Optativo");
			}else {
				System.out.println("Obrigatorio");
			}
		}
	}
}
