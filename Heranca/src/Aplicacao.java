
public class Aplicacao {
	
	public static void main(String[] args) {
		Carro c = new Carro();
		
		System.out.println("Carro");
		c.buzinar();
		c.setMarca("XYZ");
		c.setModelo("ABC");
		c.setQuatroPortas(true);
		c.setAno(2000);
		c.imprimirDados();
		
		
		System.out.println("Motocicleta");
		Motocicleta m = new Motocicleta();
		m.buzinar();
		m.empinar();
		m.imprimirDados();
		
		Caminhao cam = new Caminhao();
		cam.buzinar();
		
	}

}
