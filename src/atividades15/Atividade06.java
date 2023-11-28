package atividades15;

import java.util.Scanner;

//Faça um Programa que leia três números e mostre o maior deles.
public class Atividade06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite número 1: ");
		int numero1 = scanner.nextInt();
		System.out.println("Digite número 2: ");
		int numero2 = scanner.nextInt();
		System.out.println("Digite número 3: ");
		int numero3 = scanner.nextInt();

		if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println("Número 1 é maior");
		} else if (numero2 >= numero1 && numero2 >= numero3) {
			System.out.println("Número 2 é maior");
		} else if (numero3 >= numero1 && numero3 >= numero2) {
			System.out.println("Número 3 é maior");
		}

		scanner.close();
	}
}
