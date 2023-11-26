package atividades;

import java.util.Scanner;
//Faça um Programa que converta metros para centímetros.

public class Atividade05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite os metros:");
		int metros = scanner.nextInt();
		int centimetros = metros*100;
		System.out.println(metros+" metros é equivalenete a " + centimetros+" centimetros");

		scanner.close();
	}

}
