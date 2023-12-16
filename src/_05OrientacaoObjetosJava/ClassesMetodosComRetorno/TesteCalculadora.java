package _05OrientacaoObjetosJava.ClassesMetodosComRetorno;

public class TesteCalculadora {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();

		int resultadoSoma = calculadora.somar(5, 3);
		System.out.println("Soma: " + resultadoSoma);

		double resultadoDivisao = calculadora.dividir(10.0, 2.0);
		System.out.println("Divisão: " + resultadoDivisao);
	}
}
