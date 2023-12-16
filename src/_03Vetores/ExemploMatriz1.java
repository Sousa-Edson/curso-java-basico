package _03Vetores;

public class ExemploMatriz1 {
	public static void main(String[] args) {
		// Declarando e inicializando uma matriz 2x3 de inteiros
		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 } };

		// Exibindo a matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
