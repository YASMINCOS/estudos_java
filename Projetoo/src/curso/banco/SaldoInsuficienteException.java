package curso.banco;

@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception {

	public SaldoInsuficienteException(String message) {
		super(message);
	}

}
