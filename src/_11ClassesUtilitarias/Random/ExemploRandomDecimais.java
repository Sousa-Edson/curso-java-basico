package _11ClassesUtilitarias.Random;

import java.util.Random;

public class ExemploRandomDecimais {
    public static void main(String[] args) {
        // Criando uma instância de Random
        Random random = new Random();

        // Gerando um número decimal aleatório entre 0.0 (inclusive) e 1.0 (exclusivo)
        double numeroAleatorioDecimal = random.nextDouble();

        // Exibindo o número aleatório decimal
        System.out.println("Número Aleatório Decimal: " + numeroAleatorioDecimal);
    }
}
