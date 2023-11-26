package atividades;

import java.util.Scanner;
//Faça um Programa que peça as 4 notas bimestrais e mostre a média.

public class Atividade04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a nota 1:");
		int nota1 = scanner.nextInt();
		System.out.println("Digite a nota 2:");
		int nota2 = scanner.nextInt();
		System.out.println("Digite a nota 3:");
		int nota3 = scanner.nextInt();
		System.out.println("Digite a nota 4:");
		int nota4 = scanner.nextInt();
		int media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A média é: " + media);

		scanner.close();
	}

}
