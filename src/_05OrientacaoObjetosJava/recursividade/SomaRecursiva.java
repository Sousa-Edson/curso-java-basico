package _05OrientacaoObjetosJava.recursividade;

public class SomaRecursiva {

    // Função recursiva para calcular a soma dos números de 1 a n
    static int somaRecursiva(int n) {
        // Caso base: soma de 0 é 0
        if (n == 0) {
            return 0;
        } else {
            // Chamada recursiva: soma(n) = n + soma(n-1)
            return n + somaRecursiva(n - 1);
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso
        int numero = 5;
        int resultado = somaRecursiva(numero);
        System.out.println("A soma dos números de 1 a " + numero + " é: " + resultado);
    }
}
