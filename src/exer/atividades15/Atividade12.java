package exer.atividades15;

import java.util.Scanner;

/*Faça um programa para o cálculo de uma folha de pagamento,
sabendo que os descontos são do Imposto de Renda, que depende do
salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
a empresa que deposita). O Salário Líquido corresponde ao Salário
Bruto menos os descontos. O programa deverá pedir ao usuário o
valor da sua hora e a quantidade de horas trabalhadas no mês.
o Desconto do IR:
o Salário Bruto até 900 (inclusive) - isento
o Salário Bruto até 1500 (inclusive) - desconto de 5%
o Salário Bruto até 2500 (inclusive) - desconto de 10%
o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela
as informações, dispostas conforme o exemplo abaixo. No
exemplo o valor da hora é 5 e a quantidade de hora é 220.
Salário Bruto: (5 * 220) : R$ 1100,00
(-) IR (5%) : R$ 55,00
(-) INSS ( 10%) : R$ 110,00
FGTS (11%) : R$ 121,00
Total de descontos : R$ 165,00
Salário Liquido : R$ 935,00*/

public class Atividade12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor de sua hora: ");
		double valorHora = scanner.nextDouble();
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		double horaTrabalhada = scanner.nextDouble();

		double salarioBruto = valorHora * horaTrabalhada;

		double ir = 0;
		if (salarioBruto <= 900) {
			ir = 0.0;
		} else if (salarioBruto >= 900 && salarioBruto <= 1500) {
			ir = 5.0;
		} else if (salarioBruto >= 1500 && salarioBruto <= 2500) {
			ir = 10.0;
		} else if (salarioBruto >= 2500) {
			ir = 20.0;
		}
		double ValorInss = salarioBruto * 10 / 100;
		double valorIr = salarioBruto * ir / 100;
		double ValorSindicato = salarioBruto*0.03;
		double valorFgts=salarioBruto*0.11;		 

		double descontos=valorIr+ValorInss+ValorSindicato;
		
		double salarioLiquido=salarioBruto- descontos;
		
		System.out.println("Salário bruto "+valorHora+" * "+horaTrabalhada+" : R$ "+ salarioBruto);
		System.out.println("(-)IR "+ir+": R$ "+valorIr);
		System.out.println("(-)INSS (10%): R$ "+ValorInss);
		System.out.println("FGTS(11%): R$ "+valorFgts);
		System.out.println("Total de descontos: R$ "+descontos);
		System.out.println("Salário Liquido: R$ "+salarioLiquido);
		
		 

		scanner.close();
	}

}
