package _08Varargs;

public class ExemploVarargs {
    public static void main(String[] args) {
        exibirNumeros("Números:", 1, 2, 3, 4, 5);
        exibirNumeros("Outros números:", 10, 20, 30);
    }

    // Método que aceita varargs de inteiros
    static void exibirNumeros(String mensagem, int... numeros) {
        System.out.print(mensagem);
        for (int num : numeros) {
            System.out.print(" " + num);
        }
        System.out.println();
    }
}
