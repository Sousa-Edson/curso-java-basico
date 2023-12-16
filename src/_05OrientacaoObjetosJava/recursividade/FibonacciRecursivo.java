package _05OrientacaoObjetosJava.recursividade;

public class FibonacciRecursivo {

    // Função recursiva para calcular o termo n da sequência de Fibonacci
    static int fibonacciRecursivo(int n) {
        // Caso base: Fibonacci de 0 é 0, de 1 é 1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // Chamada recursiva: fib(n) = fib(n-1) + fib(n-2)
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso
        int termo = 7;
        int resultado = fibonacciRecursivo(termo);
        System.out.println("O termo " + termo + " da sequência de Fibonacci é: " + resultado);
    }
}
