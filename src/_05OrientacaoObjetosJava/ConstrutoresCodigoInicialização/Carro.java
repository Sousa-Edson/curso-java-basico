package _05OrientacaoObjetosJava.ConstrutoresCodigoInicialização;

public class Carro {
	private String modelo;
	private int ano;

	// Construtor
	public Carro(String modelo, int ano) {
		this.modelo = modelo;
		this.ano = ano;
	}

	// Outros métodos da classe...

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}
}
