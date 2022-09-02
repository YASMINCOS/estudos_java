
public class Ferrari implements carro, ItemCaro {

	@Override
	public void virarE() {
		System.out.println("Viroue Esquerda");
		
	}

	@Override
	public void virarD() {
 
		System.out.println("Virou direita");
	}

	@Override
	public void acelerar() {
 
		
		System.out.println("Acelerou");
	}

	@Override
	public void abrirPorta() {

		System.out.println("Abriu porta");
	}

	@Override
	public double getPreco() {
		return 111110;
	}
	
	

}
