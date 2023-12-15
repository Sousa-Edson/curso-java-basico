package aula16;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int numeroAleatorio = random.nextInt(10) + 1;
		int tentativas = 0;
		int palpite;

		System.out.println("Bem-vindo ao Jogo de Adivinhação!");

		do {
			System.out.print("Digite seu palpite (1-10): ");
			palpite = scanner.nextInt();
			tentativas++;

			if (palpite == numeroAleatorio) {
				System.out.println("Parabéns! Você acertou em " + tentativas + " tentativa(s).");
			} else {
				System.out.println("Tente novamente!");
			}
		} while (palpite != numeroAleatorio);

		scanner.close();
	}
}
