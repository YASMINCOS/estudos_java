package softblue.java.app;

//importando tudo, rerenciar classes que estão no pacote citado, possibilitando chamar apenas pelo nome da classe
import softblue.java.app.pkg1.*;

public class Aplicacao {
	public static void main(String[] args) {
		
		//softblue.java.app.pkg1.A obj1= new softblue.java.app.pkg1.A ();
		//simplificando
		
		A obj1= new A();
		//softblue.java.app.pkg2.A obj2=new softblue.java.app.pkg2.A();
		obj1.m1();
	}

}
