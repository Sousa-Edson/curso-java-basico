package _04ForEach;

public class ExemploForEach {
	public static void main(String[] args) {
		// Criando um array de strings
		String[] nomes = { "Alice", "Bob", "Charlie", "David" };

		// Usando for-each para iterar sobre os elementos do array
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}
}
