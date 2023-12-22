package _05OrientacaoObjetosJava.relacionamentoTemUm;

public class Pessoa {
	private String nome;
	private int idade;
	private Endereco endereco; // Relacionamento "tem um" com a classe Endereco

	public Pessoa() {
		super();
	}

	public Pessoa(int id, String nome, int idade) {
		this.nome = nome;
		this.idade = idade;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + "]";
	}

}