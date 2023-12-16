package _03Vetores;

import java.util.Arrays;

public class Vetores {
	public static void main(String[] args) {

		int[] numeros = { 4, 1, 3, 2, 5 };

		System.out.println(numeros[0]);

		System.out.println("tamanho:" + numeros.length);
		System.out.println();
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		// Exemplo de ordenação
		Arrays.sort(numeros);
		System.out.println();
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		System.out.println();
		// Exemplo de cópia
		int[] copia = Arrays.copyOf(numeros, numeros.length);
		for (int i = 0; i < copia.length; i++) {
			System.out.println(copia[i]);
		}
	}
}
