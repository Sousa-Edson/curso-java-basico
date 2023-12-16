package _05OrientacaoObjetosJava.ConceitosClasse;

public class Carro {
	// Atributos
	String marca;
	String modelo;
	int ano;

	// Método para exibir informações do carro
	void exibirInfo() {
		System.out.println("Carro: " + marca + " " + modelo + " (" + ano + ")");
	}
}
