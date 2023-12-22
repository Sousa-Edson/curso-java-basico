package _10TrabalhandoComStrings.JuntandoSeparando;

import java.util.StringTokenizer;

public class ExemploStringTokenizer {
	public static void main(String[] args) {
		// Criando uma string para análise
		String frase = "Java é uma linguagem de programação.";

		// Criando um StringTokenizer com espaço como delimitador padrão
		StringTokenizer tokenizer = new StringTokenizer(frase);

		// Iterando pelos tokens
		System.out.println("Tokens separados por espaços:");
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}

		// Criando um StringTokenizer com delimitadores personalizados
		String frase2 = "Maçã, Laranja, Uva, Morango";
		StringTokenizer tokenizer2 = new StringTokenizer(frase2, ", ");

		// Iterando pelos tokens
		System.out.println("\nTokens separados por vírgula e espaço:");
		while (tokenizer2.hasMoreTokens()) {
			String token = tokenizer2.nextToken();
			System.out.println(token);
		}
	}
}
