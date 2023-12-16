package _05OrientacaoObjetosJava.ConceitosClasse;

class Pessoa {
	// Atributos
	String nome;
	int idade;

	// Método para verificar se a pessoa é maior de idade
	boolean isMaiorIdade() {
		return idade >= 18;
	}
}