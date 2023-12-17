package _05OrientacaoObjetosJava._interfaces;

//Implementação da interface em uma classe
class Documento implements Imprimivel {
	private String conteudo;

	// Construtor
	public Documento(String conteudo) {
		this.conteudo = conteudo;
	}

	// Implementação do método da interface
	@Override
	public void imprimir() {
		System.out.println("Conteúdo do documento: " + conteudo);
	}
}