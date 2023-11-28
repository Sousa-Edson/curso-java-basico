package atividades13;

import java.util.Scanner;

public class Atividade14 {
	/*
	 * João Papo-de-Pescador, homem de bem, comprou um microcomputador para
	 * controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso
	 * de peixes maior que o estabelecido pelo regulamento de pesca do estado de São
	 * Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João
	 * precisa que você faça um programa que leia a variável peso (peso de peixes) e
	 * verifique se há excesso. Se houver, gravar na variável excesso e na variável
	 * multa o valor da multa que João deverá pagar. Caso contrário mostrar tais
	 * variáveis com o conteúdo ZERO.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o peso dos peixes (em quilos): ");
		double pesoPeixes = scanner.nextDouble();

		final double pesoLimite = 50.0;
		final double valorMultaPorKilo = 4.0;

		double excesso = 0.0;
		double multa = 0.0;

		if (pesoPeixes > pesoLimite) {
			excesso = pesoPeixes - pesoLimite;
			multa = excesso * valorMultaPorKilo;
		}

		System.out.println("Resumo do Controle de Pescador:");
		System.out.println("Peso informado: " + pesoPeixes + " kg");

		if (excesso > 0) {
			System.out.println("Excesso de peso: " + excesso + " kg");
			System.out.println("Multa a ser paga: R$ " + multa);
		} else {
			System.out.println("Excesso de peso: ZERO");
			System.out.println("Multa a ser paga: ZERO");
		}

		scanner.close();
	}
}
