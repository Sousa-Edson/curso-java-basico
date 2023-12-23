package _11ClassesUtilitarias.Random;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ExemploEmbaralhamentoLista {
    public static void main(String[] args) {
        // Criando uma lista de elementos
        List<String> elementos = Arrays.asList("A", "B", "C", "D", "E");

        // Criando uma instância de Random
        Random random = new Random();

        // Embaralhando os elementos da lista
        Collections.shuffle(elementos, random);

        // Exibindo a lista embaralhada
        System.out.println("Lista Embaralhada: " + elementos);
    }
}
