package atividades15;

import java.util.Scanner;

/*Faça um Programa que peça os 3 lados de um triângulo. O programa
deverá informar se os valores podem ser um triângulo. Indique, caso
os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
escaleno.
o Dicas:
o Três lados formam um triângulo quando a soma de quaisquer
dois lados for maior que o terceiro;
o Triângulo Equilátero: três lados iguais;
o Triângulo Isósceles: quaisquer dois lados iguais;
o Triângulo Escaleno: três lados diferentes;*/
public class Atividade15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o lado 1:");
		int lado1 = scanner.nextInt();

		System.out.println("Entre com o lado 2:");
		int lado2 = scanner.nextInt();

		System.out.println("Entre com o lado 3:");
		int lado3 = scanner.nextInt();

		if (lado1 + lado2 > lado3 || lado2 + lado3 > lado1 || lado3 + lado1 > lado2) {
			System.out.println("É um triangulo");
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Triângulo Equilátero: três lados iguais");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triângulo Isósceles: quaisquer dois lados iguais");
			}else {
				System.out.println("Triângulo Escaleno: três lados diferentes");
			}
		} else {
			System.out.println("Não é um triangulo");
		}

		scanner.close();
	}

}
