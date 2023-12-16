package _05OrientacaoObjetosJava.conceitosClasse;

public class ExemploContaBancaria {
	public static void main(String[] args) {
		// Criando objeto da classe ContaBancaria
		ContaBancaria conta = new ContaBancaria();
		conta.titular = "João Silva";
		conta.saldo = 1000.0;

		// Realizando operações na conta
		conta.depositar(500.0);
		conta.sacar(200.0);
		conta.sacar(800.0); // Isso resultará em saldo insuficiente
	}
}
