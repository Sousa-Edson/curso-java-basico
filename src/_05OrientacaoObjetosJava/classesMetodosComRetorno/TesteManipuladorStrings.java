package _05OrientacaoObjetosJava.classesMetodosComRetorno;

public class TesteManipuladorStrings {
	public static void main(String[] args) {
		ManipuladorStrings manipulador = new ManipuladorStrings();

		String textoInvertido = manipulador.inverter("Java");
		System.out.println("Texto invertido: " + textoInvertido);

		int numeroCaracteres = manipulador.contarCaracteres("Hello, World!");
		System.out.println("Número de caracteres: " + numeroCaracteres);
	}
}
