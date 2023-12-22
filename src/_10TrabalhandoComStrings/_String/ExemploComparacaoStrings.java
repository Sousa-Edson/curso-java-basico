package _10TrabalhandoComStrings._String;

public class ExemploComparacaoStrings {
    public static void main(String[] args) {
        // equalsIgnoreCase
        String str1 = "Java";
        String str2 = "java";
        boolean saoIguais = str1.equalsIgnoreCase(str2);
        System.out.println("As strings são iguais (ignorando caso): " + saoIguais); // true

        // regionMatches
        String str3 = "Olá, Mundo!";
        String str4 = "Mundo";
        boolean regiaoIgual = str3.regionMatches(true, 5, str4, 0, 5); // Ignora diferenças de caso
        System.out.println("As regiões são iguais: " + regiaoIgual); // true

        // startsWith
        String str5 = "Hello, World!";
        boolean comecaComHello = str5.startsWith("Hello");
        System.out.println("A string começa com 'Hello': " + comecaComHello); // true

        // endsWith
        String str6 = "Hello, World!";
        boolean terminaComWorld = str6.endsWith("World!");
        System.out.println("A string termina com 'World!': " + terminaComWorld); // true

        // compareTo
        String str7 = "apple";
        String str8 = "banana";
        int resultado = str7.compareTo(str8);
        System.out.println("Resultado da comparação lexicográfica: " + resultado); // Negativo
    }
}
