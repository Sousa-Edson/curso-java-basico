package _02ControleLoops.DoWhile;

import java.util.Scanner;

public class ValidadorSenha {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String senha;
		boolean senhaValida;

		do {
			System.out.print("Digite sua senha (mínimo 8 caracteres): ");
			senha = scanner.nextLine();
			senhaValida = senha.length() >= 8;

			if (!senhaValida) {
				System.out.println("Senha inválida. Tente novamente.");
			}

		} while (!senhaValida);

		System.out.println("Senha válida!");
		scanner.close();
	}
}
