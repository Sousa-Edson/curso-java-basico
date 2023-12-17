package _08Printf;

public class ExemploPrintf {
    public static void main(String[] args) {
        // Exemplo simples
        int numero = 42;
        System.out.printf("O número é %d.%n", numero);

        // Especificadores de formato
        double preco = 12.3456;
        System.out.printf("Preço: %.2f%n", preco);

        // Vários argumentos
        String nome = "Alice";
        int idade = 30;
        System.out.printf("Nome: %s, Idade: %d%n", nome, idade);
    }
}
