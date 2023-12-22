package _10TrabalhandoComStrings._ExemploBuscasString;

public class ExemploBuscasString {
    public static void main(String[] args) {
        // indexOf
        String texto1 = "A programação em Java é divertida.";
        int indice1 = texto1.indexOf("Java");
        System.out.println("Índice da primeira ocorrência de 'Java': " + indice1); // 18

        // lastIndexOf
        String texto2 = "A programação em Java é divertida. Java é poderosa.";
        int ultimoIndice2 = texto2.lastIndexOf("Java");
        System.out.println("Índice da última ocorrência de 'Java': " + ultimoIndice2); // 35

        // contains
        String texto3 = "Java é uma linguagem de programação.";
        boolean contemJava3 = texto3.contains("Java");
        System.out.println("A string contém 'Java': " + contemJava3); // true
    }
}

