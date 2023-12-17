package _06Exceptions;

class ContaBancaria {
	private double saldo;

	public ContaBancaria(double saldoInicial) {
		this.saldo = saldoInicial;
	}

	public void realizarSaque(double valor) throws SaldoInsuficienteException {
		if (valor > saldo) {
			throw new SaldoInsuficienteException();
		}
		saldo -= valor;
		System.out.println("Saque realizado. Novo saldo: " + saldo);
	}
}