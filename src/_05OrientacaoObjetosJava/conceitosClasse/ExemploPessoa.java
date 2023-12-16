package _05OrientacaoObjetosJava.conceitosClasse;

public class ExemploPessoa {
	public static void main(String[] args) {
		// Criando objeto da classe Pessoa
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Ana";
		pessoa.idade = 25;

		// Verificando se a pessoa é maior de idade
		if (pessoa.isMaiorIdade()) {
			System.out.println(pessoa.nome + " é maior de idade.");
		} else {
			System.out.println(pessoa.nome + " é menor de idade.");
		}
	}
}