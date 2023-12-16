package _05OrientacaoObjetosJava.classesMetodosSimples;

public class Pessoa {
    // Atributos
    String nome;
    int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para exibir informações
    void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    // Método para verificar se a pessoa é maior de idade
    boolean isMaiorIdade() {
        return idade >= 18;
    }

    // Método principal (método main)
    public static void main(String[] args) {
        // Criando uma instância da classe Pessoa
        Pessoa pessoa1 = new Pessoa("João", 25);

        // Chamando métodos da classe
        pessoa1.exibirInfo();

        if (pessoa1.isMaiorIdade()) {
            System.out.println(pessoa1.nome + " é maior de idade.");
        } else {
            System.out.println(pessoa1.nome + " é menor de idade.");
        }
    }
}

