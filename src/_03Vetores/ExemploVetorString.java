package _03Vetores;

public class ExemploVetorString {
	public static void main(String[] args) {
		// Declarando e inicializando um vetor de strings
		String[] nomes = { "Alice", "Bob", "Charlie", "David" };

		// Acessando e exibindo os elementos do vetor
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Nome " + i + ": " + nomes[i]);
		}
	}
}
