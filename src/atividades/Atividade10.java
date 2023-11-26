package atividades;

import java.util.Scanner;

/*Faça um Programa que peça a temperatura em graus Celsius,
transforme e mostre em graus Farenheit.

C = (F – 32) * ( 5 / 9)
 * */
public class Atividade10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius:");
		double temperaturaC = scanner.nextDouble();
		double temperaturaF = (temperaturaC * 9 / 5) + 32;

		System.out.println("A temperatura em Farenheit é: " + temperaturaF);
		scanner.close();
	}
}