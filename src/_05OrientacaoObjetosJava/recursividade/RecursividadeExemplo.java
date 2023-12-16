package _05OrientacaoObjetosJava.recursividade;

public class RecursividadeExemplo {

    // Função recursiva para calcular o fatorial
    static int calcularFatorial(int n) {
        // Caso base: fatorial de 0 ou 1 é 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Chamada recursiva: n! = n * (n-1)!
            return n * calcularFatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso
        int numero = 5;
        int resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}
