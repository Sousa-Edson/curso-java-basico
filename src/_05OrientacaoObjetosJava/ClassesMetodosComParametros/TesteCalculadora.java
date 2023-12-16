package _05OrientacaoObjetosJava.ClassesMetodosComParametros;

//Uso da classe
public class TesteCalculadora {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();

		// Chamada do método com parâmetros
		int resultadoSoma = calculadora.somar(5, 3);
		System.out.println("Resultado da soma: " + resultadoSoma);
	}
}