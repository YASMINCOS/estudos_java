import java.util.Scanner;

public class CondicaoComposta {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner (System.in);
		System.out.print("Informe sua data de nascimento :");
		int nasc= teclado.nextInt();
		int i= 2022 - nasc;
		
		if (i>=18) {
			System.out.println("Maioriadade, idade:"+ i);
		}else {
			System.out.println("Menoridade,idade:"+i);
		}
		
	}
}
