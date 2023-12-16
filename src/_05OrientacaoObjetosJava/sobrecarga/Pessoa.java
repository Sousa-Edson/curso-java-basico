package _05OrientacaoObjetosJava.sobrecarga;

public class Pessoa {

	private String nome;
	private int idade;

	// Construtor padrão
	public Pessoa() {
		this.nome = "Sem Nome";
		this.idade = 0;
	}

	// Construtor com nome
	public Pessoa(String nome) {
		this.nome = nome;
		this.idade = 0;
	}

	// Construtor com nome e idade
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	
}
