package _06Exceptions;

import java.util.Scanner;

public class ExemploConversao2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			// Solicita ao usuário que insira um número
			System.out.print("Digite um número inteiro: ");
			String input = scanner.nextLine();
			input = input.replace(".", "").replace(",", ".");

			// Tenta converter a String para um número double
			double numero = Double.parseDouble(input);

			// Imprime o número
			System.out.println("Número inserido: " + numero);
		} catch (NumberFormatException e) {
			// Captura e trata a exceção se a conversão falhar
			System.err.println("Erro de formato: " + e.getMessage());
		} finally {
			// Fecha o scanner no bloco finally
			scanner.close();
		}
	}
}
