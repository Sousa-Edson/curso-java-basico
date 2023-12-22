package _11ClassesUtilitarias;

public class MathUtils {
    private MathUtils() {
        // Construtor privado para evitar instância da classe utilitária
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new IllegalArgumentException("Divisão por zero não permitida");
        }
    }
}
