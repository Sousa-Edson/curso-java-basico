package exer.atividades13;

import java.util.Scanner;

public class Atividade15 {
	/*
	 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas
	 * trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês,
	 * sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e
	 * 5% para o sindicato, faça um programa que nos dê: . salário bruto. a. quanto
	 * pagou ao INSS. b. quanto pagou ao sindicato. c. o salário líquido. d. calcule
	 * os descontos e o salário líquido, conforme a tabela abaixo:
	 * 
	 * Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ =
	 * Salário Liquido : R$ Obs.: Salário Bruto - Descontos = Salário Líquido.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe quanto você ganha por hora: R$ ");
		double salarioHora = scanner.nextDouble();

		System.out.print("Informe o número de horas trabalhadas no mês: ");
		int horasTrabalhadas = scanner.nextInt();

		double salarioBruto = salarioHora * horasTrabalhadas;
		double descontoIR = 0.11 * salarioBruto;
		double descontoINSS = 0.08 * salarioBruto;
		double descontoSindicato = 0.05 * salarioBruto;

		double salarioLiquido = salarioBruto - descontoIR - descontoINSS - descontoSindicato;

		System.out.println("Salário Bruto: R$ " + salarioBruto);
		System.out.println("Desconto IR (11%): R$ " + descontoIR);
		System.out.println("Desconto INSS (8%): R$ " + descontoINSS);
		System.out.println("Desconto Sindicato (5%): R$ " + descontoSindicato);
		System.out.println("Salário Líquido: R$ " + salarioLiquido);

		scanner.close();
	}
}
