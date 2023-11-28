package atividades15;

import java.util.Scanner;

//Faça um Programa que peça dois números e imprima o maior deles.
public class Atividade01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite numeo 1: ");
		int numero1 = scanner.nextInt();
		System.out.println("Digite numeo 2: ");
		int numero2 = scanner.nextInt();

		System.out.println("Você digitou " + numero1 + " e " + numero2);
		if (numero1 > numero2) {
			System.out.println("O numero maior é: " + numero1);
		} else if (numero1 < numero2) {
			System.out.println("O numero maior é: " + numero2);
		} else {
			System.out.println("Erro ");
		}

		scanner.close();
	}

}
