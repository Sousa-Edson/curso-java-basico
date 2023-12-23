package _11ClassesUtilitarias.Random;

import java.util.Random;

public class ExemploRandomInteiros {
    public static void main(String[] args) {
        // Criando uma instância de Random
        Random random = new Random();

        // Gerando um número inteiro aleatório
        int numeroAleatorio = random.nextInt();

        // Exibindo o número aleatório
        System.out.println("Número Aleatório Inteiro: " + numeroAleatorio);
    }
}

