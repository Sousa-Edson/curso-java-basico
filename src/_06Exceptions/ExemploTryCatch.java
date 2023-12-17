package _06Exceptions;

public class ExemploTryCatch {

	public static void main(String[] args) {
		try {
			// Código que pode lançar uma exceção
			int resultado = dividir(10, 0);
			System.out.println("Resultado: " + resultado);
		} catch (ArithmeticException e) {
			// Captura e trata a exceção ArithmeticException
			System.err.println("Erro de divisão por zero: " + e.getMessage());
		} finally {
			// O bloco finally é opcional e é executado sempre, ocorrendo ou não exceção
			System.out.println("Bloco finally.");
		}
	}

	private static int dividir(int numerador, int denominador) {
		return numerador / denominador;
	}
}
