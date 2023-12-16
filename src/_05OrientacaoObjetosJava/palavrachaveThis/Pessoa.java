package _05OrientacaoObjetosJava.palavrachaveThis;

public class Pessoa {
    private String nome;
    private int idade;

    // Construtor principal
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Construtor secundário que chama o construtor principal usando 'this'
    public Pessoa(String nome) {
        this(nome, 0); // Chamada para o construtor principal
    }
}
