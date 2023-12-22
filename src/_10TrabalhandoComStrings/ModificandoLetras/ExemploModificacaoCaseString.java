package _10TrabalhandoComStrings.ModificandoLetras;

public class ExemploModificacaoCaseString {
    public static void main(String[] args) {
        // toLowerCase
        String original = "Hello World";
        String minusculas = original.toLowerCase();
        System.out.println("String em minúsculas: " + minusculas); // hello world

        // toUpperCase
        String original2 = "Hello World";
        String maiusculas = original2.toUpperCase();
        System.out.println("String em maiúsculas: " + maiusculas); // HELLO WORLD
    }
}
