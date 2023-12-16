package _05OrientacaoObjetosJava.encapsulamento;

public class Pessoa {
	private String nome;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String novoNome) {
		if (novoNome != null && !novoNome.isEmpty()) {
			nome = novoNome;
		} else {
			System.out.println("Nome inválido.");
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int novaIdade) {
		if (novaIdade >= 0) {
			idade = novaIdade;
		} else {
			System.out.println("Idade inválida.");
		}
	}
}
