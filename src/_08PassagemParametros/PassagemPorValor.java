package _08PassagemParametros;

public class PassagemPorValor {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Antes: " + x);
        modificarValor(x);
        System.out.println("Depois: " + x);
    }

    public static void modificarValor(int valor) {
        valor = 10; // Modifica o valor do parâmetro, não afeta a variável original
    }
}
