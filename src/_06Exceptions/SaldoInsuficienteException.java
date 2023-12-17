package _06Exceptions;

class SaldoInsuficienteException extends Exception {
	public SaldoInsuficienteException() {
		super("Saldo insuficiente para realizar a operação.");
	}

	public SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	}
}


