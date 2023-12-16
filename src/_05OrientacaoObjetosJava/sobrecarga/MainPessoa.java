package _05OrientacaoObjetosJava.sobrecarga;

public class MainPessoa {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(); // Sem Nome, idade 0
		Pessoa pessoa2 = new Pessoa("Alice"); // Alice, idade 0
		Pessoa pessoa3 = new Pessoa("Bob", 30); // Bob, idade 30

		System.out.println("Pessoa::" + pessoa1);
		System.out.println("Pessoa::" + pessoa2);
		System.out.println("Pessoa::" + pessoa3);
	}

}
