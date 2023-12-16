package _05OrientacaoObjetosJava.classesMetodosComRetorno;

public class ManipuladorStrings {
	public String inverter(String texto) {
		StringBuilder resultado = new StringBuilder();
		for (int i = texto.length() - 1; i >= 0; i--) {
			resultado.append(texto.charAt(i));
		}
		return resultado.toString();
	}

	public int contarCaracteres(String texto) {
		return texto.length();
	}
}
