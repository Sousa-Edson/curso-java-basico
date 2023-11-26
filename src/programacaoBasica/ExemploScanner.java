package programacaoBasica;

import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.print("Digite um número decimal: ");
        double decimal = scanner.nextDouble();

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Número inteiro: " + numero);
        System.out.println("Número decimal: " + decimal);
        System.out.println("Nome: " + nome);
        
        scanner.close();
    }
}
