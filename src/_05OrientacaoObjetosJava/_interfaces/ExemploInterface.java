package _05OrientacaoObjetosJava._interfaces;

public class ExemploInterface {
	public static void main(String[] args) {
		// Criando uma instância da classe que implementa a interface
		Documento meuDocumento = new Documento("Hello, Interface!");

		// Chamando o método da interface
		meuDocumento.imprimir();
	}
}
