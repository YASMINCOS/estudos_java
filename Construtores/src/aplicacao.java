
public class aplicacao {
	public static void main(String[] args) {
		 Retangulo r1 = new Retangulo();
		 double area1= r1.calcular();
		 
		 System.out.println(area1);
		 
		 Retangulo r2 = new Retangulo(5,9);
		 double area2=r2.calcular();
		 System.out.println(area2);
		 
	}

}
