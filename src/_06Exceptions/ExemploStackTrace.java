package _06Exceptions;

public class ExemploStackTrace {

    public static void main(String[] args) {
        try {
            metodo1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void metodo1() {
        metodo2();
    }

    static void metodo2() {
        int resultado = 10 / 0;  // Isso causará uma exceção
    }
}
