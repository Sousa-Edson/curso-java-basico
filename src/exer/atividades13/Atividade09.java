package exer.atividades13;

import java.util.Scanner;

/*
Faça um Programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius.
o C = (5 * (F-32) / 9)
 * */
public class Atividade09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a temperatura em Farenheit:");
		double temperaturaF=scanner.nextDouble();
		double temperaturaC=(5*(temperaturaF-32)/9);

		System.out.println("A temperatura em Celsius é:"+temperaturaC);
		scanner.close();
	}
}
