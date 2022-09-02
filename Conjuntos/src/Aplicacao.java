import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		//Set<String> set = new HashSet<>();
		//garante ordem de insersao
		//Set<String> set = new LinkedHashSet<>();
		
		//obdece uma ordem sem ser definida
		Set <String> set = new TreeSet<>();
		
		set.add("c5");
		set.add("b6");
		set.add("e3");
		set.add("f2");
		set.add("d4");
		set.add("a7");
		set.add("g1");
		set.add("g1");
		set.add("g1");


		
		for( String s: set) {
			System.out.println(s);
		}
		
	}

}
