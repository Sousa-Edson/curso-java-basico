package _05OrientacaoObjetosJava.classesMetodosComRetorno;

public class OperacoesMatematicas {
	public double calcularMedia(double[] valores) {
		double soma = 0;
		for (double valor : valores) {
			soma += valor;
		}
		return soma / valores.length;
	}

	public int elevarAoQuadrado(int numero) {
		return numero * numero;
	}
}
