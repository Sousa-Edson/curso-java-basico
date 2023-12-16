package _04ForEach;

public class ExemploForEachArray {
	public static void main(String[] args) {
		// Criando um array de inteiros
		int[] numeros = { 1, 2, 3, 4, 5 };

		// Usando for-each para iterar sobre os elementos do array
		for (int numero : numeros) {
			System.out.println(numero);
		}
	}
}
