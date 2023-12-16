package _05OrientacaoObjetosJava.classesMetodosComRetorno;

public class MathUtil {
	// Método para calcular o quadrado de um número
	public double calcularQuadrado(double numero) {
		return numero * numero;
	}

	public static void main(String[] args) {
		// Criando objeto da classe MathUtil
		MathUtil util = new MathUtil();

		// Chamando método e exibindo resultado
		double resultadoQuadrado = util.calcularQuadrado(4.5);

		System.out.println("Resultado do Quadrado: " + resultadoQuadrado);
	}
}
