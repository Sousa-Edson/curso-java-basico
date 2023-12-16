package exer.atividades15;

import java.util.Scanner;

/*Faça um Programa que leia um número e exiba o dia correspondente
da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
aparecer valor inválido.*/
public class Atividade13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número de 1 a 7: ");
		int numero = scanner.nextInt();

		String diaSemana;

		switch (numero) {
		case 1:
			diaSemana = "Domingo";
			break;
		case 2:
			diaSemana = "Segunda-feira";
			break;
		case 3:
			diaSemana = "Terça-feira";
			break;
		case 4:
			diaSemana = "Quarta-feira";
			break;
		case 5:
			diaSemana = "Quinta-feira";
			break;
		case 6:
			diaSemana = "Sexta-feira";
			break;
		case 7:
			diaSemana = "Sábado";
			break;
		default:
			diaSemana = "Número inválido. Tente novamente.";
		}

		System.out.println("Você digitou o número " + numero + ", que corresponde a " + diaSemana + ".");

		scanner.close();
	}

}
