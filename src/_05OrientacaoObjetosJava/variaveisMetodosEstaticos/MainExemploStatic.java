package _05OrientacaoObjetosJava.variaveisMetodosEstaticos;

public class MainExemploStatic {
	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			// Acesso à variável estática
			int valorAtual = ExemploStatic.contador;
			// Chamada do método estático
			ExemploStatic.incrementarContador();
			System.out.println(valorAtual);
		}
	}
}
