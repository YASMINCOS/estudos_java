
public class Operadores {

	public static void main(String[] args) {
		int n1=3;
		int n2=5;
		float m=(n1+n2)/2;
		System.out.println("A media e igual a "+m);
		
		int numero=5;
		int valor= 5 + numero++;
		System.out.println(numero);
		
		int numero2=10;
		//primeiro soma depois realiza a decrementacao
		int valor2=4+ numero2--;
		System.out.println(valor2);
		System.out.println(numero2);
		
		int x=4;
		//somei
		x +=2;
		System.out.println(x);
		
		//math pi pow-exponenciacao sqrt-raiz quadrada
		
		float y= 8.3f;
		int ar= (int)Math.floor(y);
		System.out.println(ar);
		
		float v= 8.3f;
		int are= (int)Math.ceil(v);
		System.out.println(are);
		//arredendodar p cimar=ceil/round	}
		
		double ale=Math.random();
		int ni=(int)(5+ ale *(10-5));
		System.out.println(ni);
		
		double ge=Math.random();
		int ger=(int)(15+ ge *(50-15));
		System.out.println(ger);
		
}
}
