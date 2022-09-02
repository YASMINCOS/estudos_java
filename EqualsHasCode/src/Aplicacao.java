import java.util.HashSet;
import java.util.Set;

public class Aplicacao {

	public static void main(String[] args) {
		
		Produto p1= new Produto(1, "Produto1");
		Produto p2= new Produto(1, "Produto1");
		Produto p3= new Produto(1, "Produto1");
		Produto p4= new Produto(1, "Produto1");
		Produto p5= new Produto(1, "Produto1");

		
		Set<Produto> produtos= new HashSet<>();
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);
		
		for (Produto produto : produtos) {
			System.out.println("=>" + produto);
			
		}
	}
}
