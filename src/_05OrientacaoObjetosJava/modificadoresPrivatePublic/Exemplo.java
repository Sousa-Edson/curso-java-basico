package _05OrientacaoObjetosJava.modificadoresPrivatePublic;

public class Exemplo {
	private int numeroPrivado;
	public String nomePublico;

	public Exemplo(int numero, String nome) {
		this.numeroPrivado = numero;
		this.nomePublico = nome;
	}

	private void metodoPrivado() {
		System.out.println("Método privado");
	}

	public void metodoPublico() {
		System.out.println("Método público");
		metodoPrivado(); // Membros privados podem ser acessados internamente na classe.
	}
}
