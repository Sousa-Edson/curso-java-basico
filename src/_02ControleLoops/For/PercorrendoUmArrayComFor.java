package _02ControleLoops.For;

public class PercorrendoUmArrayComFor {
	public static void main(String[] args) {
		int[] numeros = { 2, 4, 6, 8, 10 };
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Elemento " + (i + 1) + ": " + numeros[i]);
		}

	}
}
