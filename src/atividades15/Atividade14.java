package atividades15;

import java.util.Scanner;

/*Faça um programa que lê as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua média. A
atribuição de conceitos obedece à tabela abaixo:
o Média de Aproveitamento Conceito
o Entre 9.0 e 10.0 A
o Entre 7.5 e 9.0 B
o Entre 6.0 e 7.5 C
o Entre 4.0 e 6.0 D
o Entre 4.0 e zero E
O algoritmo deve mostrar na tela as notas, a média, o conceito
correspondente e a mensagem “APROVADO” se o conceito for
A, B ou C ou “REPROVADO” se o conceito for D ou E.*/
public class Atividade14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite nota 1: ");
		double nota1 = scanner.nextDouble();
		System.out.println("Digite nota 2: ");
		double nota2 = scanner.nextDouble();

		double media = (nota1 + nota2) / 2;

		String conceito = "erro";

		if (media >= 9 && media <= 10) {
			conceito = "A";
		} else if (media >= 7.5 && media <= 9) {
			conceito = "B";
		} else if (media >= 6 && media <= 7.5) {
			conceito = "C";
		} else if (media >= 4 && media <= 6) {
			conceito = "D";
		} else if (media <= 4) {
			conceito = "E";
		} else {
			System.out.println(media);
		}
		String mensagem;
		switch (conceito) {
		case "A":
		case "B":
		case "C":
			mensagem = "APROVADO";
			break;

		default:
			mensagem = "REPROVADO";
			break;
		}

		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Conceito: " + conceito);
		System.out.println("Mensagem: " + mensagem);
		scanner.close();
	}

}
