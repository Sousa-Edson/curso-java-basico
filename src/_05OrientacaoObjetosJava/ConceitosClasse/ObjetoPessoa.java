package _05OrientacaoObjetosJava.ConceitosClasse;

//Definição da classe Pessoa
public class ObjetoPessoa {
	// Atributos da classe
	String nome;
	int idade;

	// Método construtor para inicializar objetos da classe
	public ObjetoPessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	// Método para exibir informações da pessoa
	public void exibirInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}

	// Método principal (método estático) para iniciar o programa
	public static void main(String[] args) {
		// Criando objetos da classe Pessoa
		ObjetoPessoa pessoa1 = new ObjetoPessoa("Alice", 25);
		ObjetoPessoa pessoa2 = new ObjetoPessoa("Bob", 30);

		// Chamando métodos para exibir informações
		pessoa1.exibirInformacoes();
		pessoa2.exibirInformacoes();
	}
}
