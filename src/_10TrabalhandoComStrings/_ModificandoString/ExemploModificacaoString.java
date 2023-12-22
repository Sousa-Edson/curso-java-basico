package _10TrabalhandoComStrings._ModificandoString;

public class ExemploModificacaoString {
    public static void main(String[] args) {
        // substring
        String original = "Hello, World!";
        String subcadeia = original.substring(7, 12);
        System.out.println("Subcadeia: " + subcadeia); // World

        // concat
        String str1 = "Hello";
        String str2 = " World!";
        String resultado = str1.concat(str2);
        System.out.println("Resultado da concatenação: " + resultado); // Hello World!

        // replace
        String original2 = "Java é divertido!";
        String modificado = original2.replace('a', 'o');
        System.out.println("String modificada: " + modificado); // Jovo é divertido!

        // trim
        String comEspacos = "   Olá, Mundo!   ";
        String semEspacos = comEspacos.trim();
        System.out.println("String sem espaços: " + semEspacos); // Olá, Mundo!
    }
}
