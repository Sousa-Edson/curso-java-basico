package atividades13;

import java.util.Scanner;
/*
 Tendo como dados de entrada a altura de uma pessoa, construa um
algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7altura) - 58
 * */

public class Atividade12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a altura:");
		 double altura = scanner.nextDouble();

		 
		 double pesoIdeal = (72.7 * altura) - 58;		 

		 System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");
		 
		 scanner.close();
	}
}
