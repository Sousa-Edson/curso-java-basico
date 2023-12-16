package exer.atividades15;

import java.util.Scanner;

//Faça um Programa que verifique se uma letra digitada é "F" ou "M".
//Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
public class Atividade03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite F(feminino) ou M(masculino):");
		String sexo = scanner.next();
		if (sexo.equalsIgnoreCase("f")) {
			System.out.println("Selecionado feminino");
		} else if (sexo.equalsIgnoreCase("m")) {
			System.out.println("Selecionado masculino");
		} else {
			System.out.println("Sexo Inválido");
		}

		scanner.close();
	}

}
