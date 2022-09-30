import java.util.Scanner;

public class CondicaoMultiplaEscolha {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("Informe quantas patas tem: ");
		int pernas=teclado.nextInt();
		String tipo;
		System.out.println("Isso e um (a):");
		
		switch(pernas) {
			case 1:
				tipo="Saci";
				break;
			case 2:
				tipo="Bipede";
				break;
			case 3:
				tipo="Tripe";
				break;
			case 4:
				tipo="Quadrupede";
				break;
			case 6:
				tipo="Aranha";
				break;
			default:
				tipo="Et";
				break;
				
		}
		System.out.print( tipo);			
	}
}
