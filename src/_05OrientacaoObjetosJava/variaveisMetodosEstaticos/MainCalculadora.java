package _05OrientacaoObjetosJava.variaveisMetodosEstaticos;

public class MainCalculadora {
	public static void main(String[] args) {
		// Chamada de métodos estáticos
		int resultadoSoma = Calculadora.somar(5, 3);
		int resultadoQuadrado = Calculadora.quadrado(4);
		int resultadoQuadradoMath = Calculadora.quadradoComMath(20);

		
		System.out.println(resultadoSoma);
		System.out.println(resultadoQuadrado);
		System.out.println(resultadoQuadradoMath);
	}
}
