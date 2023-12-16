package _03Vetores;

public class ExemploMatriz {
	public static void main(String[] args) {
		// Declarando e inicializando uma matriz 3x3 de inteiros
		int[][] matriz = new int[3][3];

		// Preenchendo a matriz com valores
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = i + j; // Preenchendo com a soma dos índices
			}
		}

		// Exibindo a matriz
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(); // Nova linha para cada nova linha da matriz
		}
	}
}
