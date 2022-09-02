
public class Aplicacao {

	public static void main(String[] args) throws Exception {
		
			ContaBancaria c = new ContaBancaria(1000);
			
			try {
				c.sacar(-50);
				System.out.println("Saque realizado");
			}finally {
				System.out.println(c.getSaldo());

			}
	}
}
