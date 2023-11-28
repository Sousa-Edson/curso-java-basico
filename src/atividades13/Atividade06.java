package atividades13;

import java.util.Scanner;
/*Faça um Programa que peça o raio de um círculo, calcule e mostre
sua área.*/

public class Atividade06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com o raio do circulo:");
		double raio = scanner.nextDouble();
		double area = Math.PI * Math.pow(raio, 2);
		System.out.println(" A area do circulo é " + area + " ");

		scanner.close();
	}

}
