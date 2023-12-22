package _11ClassesUtilitarias.Locale;

import java.util.Locale;

public class ExemploLocaleEspecifico {
    public static void main(String[] args) {
        // Criando uma configuração específica (português no Brasil)
        Locale localeBrasil = new Locale("pt", "BR");

        // Usando a configuração específica
        System.out.println("Idioma: " + localeBrasil.getLanguage());
        System.out.println("Região: " + localeBrasil.getCountry());
    }
}
