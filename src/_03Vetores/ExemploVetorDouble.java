package _03Vetores;

public class ExemploVetorDouble {
	public static void main(String[] args) {
		// Declarando e inicializando um vetor de doubles
		double[] precos = { 10.5, 20.75, 15.0, 30.25, 12.8 };

		// Acessando e exibindo os elementos do vetor
		for (int i = 0; i < precos.length; i++) {
			System.out.println("Preço " + i + ": " + precos[i]);
		}
	}
}
