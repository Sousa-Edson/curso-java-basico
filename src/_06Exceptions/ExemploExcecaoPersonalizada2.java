package _06Exceptions;

public class ExemploExcecaoPersonalizada2 {
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria(1000);

		try {
			// Tentar realizar um saque maior que o saldo
			conta.realizarSaque(1500);
		} catch (SaldoInsuficienteException e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
}