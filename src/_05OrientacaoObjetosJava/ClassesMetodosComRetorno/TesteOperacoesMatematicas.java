package _05OrientacaoObjetosJava.ClassesMetodosComRetorno;

public class TesteOperacoesMatematicas {
	public static void main(String[] args) {
		OperacoesMatematicas operacoes = new OperacoesMatematicas();

		double[] notas = { 7.5, 8.0, 9.5, 6.0, 7.8 };
		double media = operacoes.calcularMedia(notas);
		System.out.println("Média das notas: " + media);

		int quadrado = operacoes.elevarAoQuadrado(4);
		System.out.println("Quadrado de 4: " + quadrado);
	}
}
