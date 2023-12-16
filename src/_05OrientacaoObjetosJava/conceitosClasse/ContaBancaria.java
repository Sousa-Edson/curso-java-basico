package _05OrientacaoObjetosJava.conceitosClasse;

class ContaBancaria {
	// Atributos
	String titular;
	double saldo;

	// Método para realizar um depósito
	void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
	}

	// Método para realizar um saque
	void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
		} else {
			System.out.println("Saldo insuficiente para o saque.");
		}
	}
}