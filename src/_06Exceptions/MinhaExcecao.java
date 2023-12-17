package _06Exceptions;

//Defina sua própria exceção estendendo Exception
class MinhaExcecao extends Exception {
	// Adicione construtores necessários
	public MinhaExcecao() {
		super();
	}

	public MinhaExcecao(String mensagem) {
		super(mensagem);
	}

	// Método que pode lançar sua exceção personalizada
	static void validarIdade(int idade) throws MinhaExcecao {
		if (idade < 18) {
			// Lance sua exceção personalizada
			throw new MinhaExcecao("A idade mínima é 18 anos.");
		} else {
			System.out.println("Idade válida: " + idade);
		}
	}
}