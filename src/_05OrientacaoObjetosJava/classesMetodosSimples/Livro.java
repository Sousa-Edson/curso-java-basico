package _05OrientacaoObjetosJava.classesMetodosSimples;

public class Livro {
	// Atributos privados
	private String titulo;
	private String autor;
	private int anoPublicacao;

	// Construtor
	public Livro(String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	// Método para exibir informações
	public void exibirInfo() {
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Ano de Publicação: " + anoPublicacao);
	}

	public static void main(String[] args) {
		// Criando objeto da classe Livro usando o construtor
		Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);

		// Chamando método para exibir informações
		livro.exibirInfo();
	}
}
