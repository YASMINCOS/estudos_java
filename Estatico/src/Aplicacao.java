
public class Aplicacao {

	public static void main(String[] args) {
		
		//Matematica m = new Matematica();
		//int soma = m.somar(10, 3);
		//int subtracao=m.subtrair(2,8);
		
		//int soma = Matematica.somar(12, 4);
		//int subtracao= Matematica.subtrair(20, 3);
		//System.out.println(soma);
		//System.out.println(subtracao);
		
		Contador c1=new Contador();
		c1.incrementar();
		Contador c2=new Contador();
		Contador c3=new Contador();
		
		System.out.println(c1.getValor());
		System.out.println(c2.getValor());
		System.out.println(c3.getValor());

	}
}
