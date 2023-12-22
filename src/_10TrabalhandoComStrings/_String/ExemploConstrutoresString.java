package _10TrabalhandoComStrings._String;

import java.nio.charset.StandardCharsets;

public class ExemploConstrutoresString {
    public static void main(String[] args) {
        // Construtor Padrão
        String vazia = new String();
        System.out.println("String vazia: " + vazia);

        // Construtor com Sequência de Caracteres
        char[] arrayDeChars = {'H', 'e', 'l', 'l', 'o'};
        String saudacao = new String(arrayDeChars);
        System.out.println("Saudação: " + saudacao);

        // Construtor com Outra String
        String original = "Olá";
        String copia = new String(original);
        System.out.println("Cópia: " + copia);

        // Construtor com Bytes
        byte[] bytes = {65, 66, 67}; // Representa "ABC" em ASCII
        String strBytes = new String(bytes);
        System.out.println("String a partir de bytes: " + strBytes);

        // Construtor com Bytes e Especificação de Codificação
        byte[] bytesUTF8 = {65, 66, 67}; // Representa "ABC" em UTF-8
        String strUTF8 = new String(bytesUTF8, StandardCharsets.UTF_8);
        System.out.println("String com codificação UTF-8: " + strUTF8);

        // Construtor com String Formatada
        String formato = "O valor de %s é %d";
        String mensagemFormatada = String.format(formato, "x", 42);
        System.out.println("String formatada: " + mensagemFormatada);

        // Construtor com Índices Específicos de uma Sequência de Caracteres
        String substring = new String(arrayDeChars, 1, 3); // Cria "ell"
        System.out.println("Substring: " + substring);
    }
}
