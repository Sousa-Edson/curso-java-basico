package _03Vetores;

public class ExemploMatriz2 {
	public static void main(String[] args) {
		// Declarando e inicializando uma matriz 2x2 de strings
		String[][] matriz = { { "Java", "C++" }, { "Python", "JavaScript" } };

		// Exibindo a matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
