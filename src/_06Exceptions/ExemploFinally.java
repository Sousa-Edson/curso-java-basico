package _06Exceptions;

import java.util.Scanner;

public class ExemploFinally {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            System.out.println("Número digitado: " + numero);

        } catch (Exception e) {
            System.err.println("Ocorreu uma exceção: " + e.getMessage());

        } finally {
            // Este bloco será sempre executado, mesmo que ocorra uma exceção
            scanner.close();
            System.out.println("Scanner fechado no bloco finally.");
        }
    }
}
