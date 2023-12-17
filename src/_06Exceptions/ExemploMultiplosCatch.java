package _06Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploMultiplosCatch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Digite um número inteiro: ");
			int numero = scanner.nextInt();

			// Se o usuário digitar uma string, a exceção InputMismatchException será
			// lançada
			System.out.println("Você digitou: " + numero);

			// Dividir por zero resultará em uma ArithmeticException
			int resultado = 10 / numero;
			System.out.println("Resultado da divisão: " + resultado);

		} catch (InputMismatchException e) {
			System.err.println("Entrada inválida. Por favor, digite um número inteiro.");
		} catch (ArithmeticException e) {
			System.err.println("Erro de aritmética: " + e.getMessage());
		} catch (Exception e) {
			// Captura exceções gerais que não foram tratadas pelos blocos catch anteriores
			System.err.println("Ocorreu uma exceção: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
