package _05OrientacaoObjetosJava.polimorfismo;

public class Calculadora {

	// Método para somar dois inteiros
	public int somar(int a, int b) {
		return a + b;
	}

	// Método para somar três inteiros
	public int somar(int a, int b, int c) {
		return a + b + c;
	}

	// Método para somar dois números de ponto flutuante
	public double somar(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();

		// Chamando os métodos de maneiras diferentes
		int resultado1 = calculadora.somar(5, 10);
		int resultado2 = calculadora.somar(2, 3, 7);
		double resultado3 = calculadora.somar(3.5, 2.5);

		System.out.println("Resultado 1: " + resultado1);
		System.out.println("Resultado 2: " + resultado2);
		System.out.println("Resultado 3: " + resultado3);
	}
}
