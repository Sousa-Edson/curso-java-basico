package _03Vetores;

public class ExemploMatriz3 {
	public static void main(String[] args) {
		// Declarando e inicializando uma matriz 3x2 de números decimais
		double[][] matriz = { { 1.5, 2.5 }, { 3.0, 4.8 }, { 5.2, 6.1 } };

		// Exibindo a matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
