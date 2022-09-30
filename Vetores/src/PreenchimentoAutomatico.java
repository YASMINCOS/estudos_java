import java.util.Arrays;

public class PreenchimentoAutomatico {

	public static void main(String[] args) {
		int num[]=new int[20];
		Arrays.fill(num, 0);
		for( int v: num) {
			System.out.println(v);
		}
		
	}
}
