package _08PassagemParametros;

public class PassagemPorReferencia {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Alice");
        System.out.println("Antes: " + pessoa.getNome());
        modificarNome(pessoa);
        System.out.println("Depois: " + pessoa.getNome());
    }

    public static void modificarNome(Pessoa p) {
        p.setNome("Bob"); // Modifica o atributo do objeto referenciado
    }
}

class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
