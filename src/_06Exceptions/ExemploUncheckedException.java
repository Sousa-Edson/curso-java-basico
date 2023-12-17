package _06Exceptions;

public class ExemploUncheckedException {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        try {
            // Isso causará uma exceção ArrayIndexOutOfBoundsException
            int valor = array[5];
            System.out.println("Valor: " + valor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Índice inválido: " + e.getMessage());
            System.err.println("Índice inválido e:: " + e);
        }
    }
}

