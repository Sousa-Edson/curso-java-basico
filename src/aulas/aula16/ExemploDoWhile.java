package aulas.aula16;

import java.util.Scanner;

public class ExemploDoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;

		do {
			System.out.print("Digite um número positivo: ");
			numero = scanner.nextInt();

			if (numero <= 0) {
				System.out.println("Número inválido. Tente novamente.");
			}
		} while (numero <= 0);

		System.out.println("Você digitou um número válido: " + numero);
		scanner.close();
	}
}
