package atividades;

import java.util.Scanner;
/* Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês.*/

public class Atividade08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora?");
		double valorHora = scanner.nextDouble();
		System.out.println("Quantas horas você trabalhou no mês?");
		double quantidadeHora = scanner.nextDouble();
		double salario = valorHora * quantidadeHora;

		System.out.println(" O seu salário é " + salario + " ");

		scanner.close();
	}

}
