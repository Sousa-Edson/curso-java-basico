package _11ClassesUtilitarias.Random;

import java.util.Random;

public class ExemploRandomIntervalo {
    public static void main(String[] args) {
        // Criando uma instância de Random
        Random random = new Random();

        // Gerando um número inteiro aleatório no intervalo [0, 10)
        int numeroAleatorioIntervalo = random.nextInt(10);

        // Exibindo o número aleatório no intervalo
        System.out.println("Número Aleatório no Intervalo: " + numeroAleatorioIntervalo);
    }
}
