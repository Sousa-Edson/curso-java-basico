package atividades13;

import java.util.Scanner;
/* Faça um Programa que calcule a área de um quadrado, em seguida
mostre o dobro desta área para o usuário.*/

public class Atividade07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o tamanho do lado do quadrado:");
		double lado = scanner.nextDouble();
		double area = Math.pow(lado, 2);
		System.out.println(" A area do quadrado é " + area + " ");
		System.out.println(" O dobro da area do quadrado é " + (area)*2 + " ");

		scanner.close();
	}

}
