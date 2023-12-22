package _10TrabalhandoComStrings.JuntandoSeparando;

import java.util.Arrays;

public class ExemploJuncaoSeparacaoString {
    public static void main(String[] args) {
        // join
        String[] palavras = {"Olá", "Mundo", "Java"};
        String resultado = String.join(" ", palavras);
        System.out.println("Resultado da junção: " + resultado); // Olá Mundo Java

        // split
        String frase = "Java é uma linguagem de programação";
        String[] palavrasSeparadas = frase.split(" ");
        System.out.println("Palavras separadas: " + Arrays.toString(palavrasSeparadas));
        // [Java, é, uma, linguagem, de, programação]
    }
}
