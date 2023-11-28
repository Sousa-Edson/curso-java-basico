package atividades13;

import java.util.Scanner;

/*faça um Programa que peça um número e então mostre a
mensagem O número informado foi [número].*/
public class Atividade02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int numero = scanner.nextInt();
		System.out.println("O numero informado foi: " + numero);

		scanner.close();
	}

}
