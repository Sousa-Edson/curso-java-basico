package _05OrientacaoObjetosJava.variaveisMetodosEstaticos;

public class Calculadora {

	// Método estático para somar dois números
	public static int somar(int a, int b) {
		return a + b;
	}

	// Método estático para calcular o quadrado de um número
	public static int quadrado(int x) {
		return x * x;
	}

	// Método estático para calcular o quadrado de um número
	public static int quadradoComMath(int x) {
		return (int) Math.pow(x, 2);
	}
}
