package controleDecisao;

import java.util.Scanner;

public class StatusAluno {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a nota do aluno: ");
		double nota = scanner.nextDouble();

		if (nota >= 9.0) {
			System.out.println("Status: Excelente");
		} else if (nota >= 7.0) {
			System.out.println("Status: Bom");
		} else if (nota >= 5.0) {
			System.out.println("Status: Regular");
		} else {
			System.out.println("Status: Insuficiente");
		}

		scanner.close();
	}
}
