package _05OrientacaoObjetosJava.encapsulamento;

public class Main {
public static void main(String[] args) {
	Pessoa pessoa = new Pessoa();
	pessoa.setNome("Rosalia");
	pessoa.setIdade(38);

	System.out.println("Nome: " + pessoa.getNome());
	System.out.println("Idade: " + pessoa.getIdade());

}
}
