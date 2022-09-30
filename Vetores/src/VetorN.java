import java.util.Arrays;

public class VetorN {

	public static void main(String[] args) {
		int num []= {3,4,7,8,9,5};
		//colocando o vetor em ordem 
		Arrays.sort(num);
		for( int numero:num) {
			System.out.println(numero);
		}
	}
}
