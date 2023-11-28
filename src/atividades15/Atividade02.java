package atividades15;

import java.util.Scanner;

public class Atividade02 {
//	Faça um Programa que peça um valor e mostre na tela se o valor é
//	positivo ou negativo
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número negativo ou positivo: ");
		int numero = scanner.nextInt();
		if (numero > 0) {
			System.out.println("Número " + numero + " é positivo");
		} else if (numero < 0) {
			System.out.println("Número " + numero + " é negativo");
		} else {
			System.out.println("Número " + numero + " é zero");
		}
		scanner.close();
	}
}
