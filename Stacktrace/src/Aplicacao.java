
public class Aplicacao {

	public static void main(String[] args)  {
		

		Pista p = new Pista();
		
		try {
			p.iniciar();
		} catch (PistaException e) {
			
			e.printStackTrace();
			// TODO Auto-generated catch block
		}
	}
}
