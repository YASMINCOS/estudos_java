
public class Apicacao {

	public static void main(String[] args) {
		Matematica m = new Matematica ();
		
		int soma = m.somar(10, 10,12);
				
		System.out.println(soma);
		
		double soma2=m.somar(10.9, 29.3);
		System.out.println(soma2);
	}
}
