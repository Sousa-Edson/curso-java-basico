package exer.atividades13;

import java.util.Scanner;

/*
Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.
 * */
public class Atividade11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digitenúmero inteiro 1:");
		int numeroInteiro1 = scanner.nextInt();
//		System.out.println("Digitenúmero inteiro 2:");
		int numeroInteiro2 = scanner.nextInt();
		System.out.println("Digitenúmero real 1:");
		double numeroReal1 = scanner.nextDouble();

		double resultadoA = (numeroInteiro1 * 2) + (numeroInteiro2) / 2;
		double resultadoB = (numeroInteiro1 * 3) + numeroReal1;
		double resultadoC = Math.pow(numeroReal1, 3);

		System.out.println("O produto do dobro do primeiro com metade do segundo: " + resultadoA);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + resultadoB); 
		System.out.println("O terceiro elevado ao cubo: " + resultadoC);
		scanner.close();
	}
}