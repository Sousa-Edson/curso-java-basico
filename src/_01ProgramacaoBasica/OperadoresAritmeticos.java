package _01ProgramacaoBasica;

import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
         
        double divisao = (numero2 != 0) ? (double) numero1 / numero2 : Double.POSITIVE_INFINITY;

        int resto = (numero2 != 0) ? numero1 % numero2 : -1; // -1 indica que a operação não é válida

        // Exibir os resultados
        System.out.println("\nResultados:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        
        if (resto != -1) {
            System.out.println("Resto: " + resto);
        } else {
            System.out.println("Divisão por zero. Resto não aplicável.");
        }
 
        scanner.close();
    }
}
