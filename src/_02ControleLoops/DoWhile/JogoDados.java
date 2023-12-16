package _02ControleLoops.DoWhile;

import java.util.Random;
import java.util.Scanner;

public class JogoDados {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		char continuar;

		do {
			int dado1 = random.nextInt(6) + 1;
			int dado2 = random.nextInt(6) + 1;

			System.out.println("Você tirou " + dado1 + " e " + dado2);
			System.out.print("Deseja lançar os dados novamente? (S/N): ");
			continuar = scanner.next().charAt(0);

		} while (continuar == 'S' || continuar == 's');
		scanner.close();
	}
}
