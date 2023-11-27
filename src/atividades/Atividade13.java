package atividades;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade13 {
	/*
	 * Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um
	 * algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas: .
	 * Para homens: (72.7h) - 58 a. Para mulheres: (62.1*h) - 44.7 (h = altura) b.
	 * Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite sua altura: ");
		double altura = scanner.nextDouble();
		System.out.println("Digite M para masculino ou F para feminino: ");
		String sexo = scanner.next();
		System.out.println("Digite seu peso atual: ");
		double pesoAtual = scanner.nextDouble();

		double pesoIdeal;
		sexo = sexo.substring(0, 1).toLowerCase();

		if (sexo.equals("m")) {
			pesoIdeal = (72.7 * altura) - 58;
		} else {
			pesoIdeal = (72.1 * altura) - 44.7;
		}
		// Arredonda o número
		long numeroArredondado = Math.round(pesoIdeal * 1000); // Multiplica por 1000 para manter três casas decimais
		pesoIdeal = (double) numeroArredondado / 1000; // Divide por 1000 para obter o resultado final

		if (pesoIdeal > pesoAtual) {
			System.out.println("Você esta abaixo do peso ideal!\nSeu peso ideal é " + pesoIdeal);
		} else if (pesoIdeal < pesoAtual) {
			System.out.println("Você esta acima do peso ideal!\\nSeu peso ideal é " + pesoIdeal);
		} else {
			System.out.println("Você esta dentro do peso ideal!");
		}
		System.out.println(sexo);

		scanner.close();

	}

}
