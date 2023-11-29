package atividades15;

import java.util.Scanner;

public class Atividade08 {
	/*
	 * Faça um programa que pergunte o preço de três produtos e informe qual produto
	 * você deve comprar, sabendo que a decisão é sempre pelo mais barato.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o primeiro preço: ");
		double preco1 = scanner.nextDouble();
		System.out.println("Entre com o segundo preço: ");
		double preco2 = scanner.nextDouble();
		System.out.println("Entre com o terçeiro preço: ");
		double preco3 = scanner.nextDouble();

		if (preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("Compre o produto 1 R$ " + preco1);
		} else if (preco2 <= preco1 && preco2 <= preco3) {
			System.out.println("Compre o produto 2 R$ " + preco2);
		} else if (preco3 <= preco1 && preco3 <= preco2) {
			System.out.println("Compre o produto 3 R$ " + preco3);
		}
		scanner.close();
	}
}
