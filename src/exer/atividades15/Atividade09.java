package exer.atividades15;

import java.util.Scanner;

public class Atividade09 {
//	Faça um Programa que leia três números e mostre-os em ordem decrescente.
//132 123 213 231 321 312

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite número 1: ");
		int num1 = scanner.nextInt();
		System.out.println("Digite número 2: ");
		int num2 = scanner.nextInt();
		System.out.println("Digite número 3: ");
		int num3 = scanner.nextInt();

		if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
			// num1 é menor
			// num3 é maior
			// num1 < num2 < num3
			System.out.println(num3 + " - " + num2 + " - " + num1);

		} else if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
			// num1 é menor
			// num2 é maior
			// num1 < num3 < num2
			System.out.println(num2 + " - " + num3 + " - " + num1);

		} else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
			// num2 é menor
			// num3 é maior
			// num2 < num1 < num3
			System.out.println(num3 + " - " + num1 + " - " + num2);

		} else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
			// num2 é menor
			// num1 é maior
			// num2 < num3 < num1
			System.out.println(num1 + " - " + num3 + " - " + num2);

		} else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
			// num3 é menor
			// num2 é maior
			// num3 < num1 < num2
			System.out.println(num2 + " - " + num1 + " - " + num3);

		} else if (num3 <= num1 && num3 <= num2 && num2 <= num1) {
			// num3 é menor
			// num1 é maior
			// num3 < num2 < num1
			System.out.println(num1 + " - " + num2 + " - " + num3);

		}

		scanner.close();
	}
}
