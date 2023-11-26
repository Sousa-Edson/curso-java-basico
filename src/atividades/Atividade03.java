package atividades;

import java.util.Scanner;
//Faça um Programa que peça dois números e imprima a soma
public class Atividade03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int numero = scanner.nextInt();
		System.out.println("Digite outro numero:");
		int numero2 = scanner.nextInt();
		int soma = numero+numero2;
		System.out.println("A soma é : " + soma);

		scanner.close();
	}

}
