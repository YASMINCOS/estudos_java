import java.util.Arrays;

public class RealizandoBusca {

	public static void main(String[] args) {
		 int d[]= {3,7,8,4,3};
		 for (int doubl:d) {
			 System.out.println(doubl);
		 }
		 System.out.println("");
		 int pos= Arrays.binarySearch(d,8);
		 System.out.println("Encontrei o valor na posicao "+ pos);
	}
}
