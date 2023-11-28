package controleDecisao;

import java.util.Scanner;

public class VogalOuConsoante {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma letra:");
		String letra = scanner.nextLine();
//		letra = letra.substring(0, 1);
		if (letra.length() == 1) {
			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.println("vogal");
				break;
			default:
				System.out.println("consoante");
				break;
			}
		} else {
			System.out.println("Não é uma letra válida!");
		}

		scanner.close();
	}

}
