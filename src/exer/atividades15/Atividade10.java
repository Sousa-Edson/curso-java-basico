package exer.atividades15;

import java.util.Scanner;

/*Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso.*/
public class Atividade10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o turno que você estuda \nM-matutino ou V-Vespertino ou N- Noturno: ");
		String turno = scanner.next();

		switch (turno) {
		case "m":
		case "M":
			System.out.println("Bom Dia!");
			break;
		case "v":
		case "V":
			System.out.println("Boa Tarde!");
			break;
		case "n":
		case "N":
			System.out.println("Boa Noite!");
			break;

		default:
			System.out.println("Turno inválido!");
			break;
		}
		scanner.close();
	}

}
