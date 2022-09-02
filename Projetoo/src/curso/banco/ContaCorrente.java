package curso.banco;

public class ContaCorrente extends Conta {

	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {

		if (getSaldoDisponivel() - valor < 0) {
			throw new SaldoInsuficienteException("Saldo insuficiente");
		}

		setSaldoDisponivel(getSaldoDisponivel() - valor);
	}

	@Override
	public void depositar(double valor) {

		//TODO Checar se o valor não é negativo ou zero
		setSaldoDisponivel(getSaldoDisponivel() + valor);
	}

}
