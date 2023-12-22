package _11ClassesUtilitarias.Locale;

import java.util.Locale;

public class ExemploLocalePadrao {
    public static void main(String[] args) {
        // Obtendo a configuração padrão do sistema
        Locale localePadrao = Locale.getDefault();
        System.out.println("Configuração Padrão do Sistema: " + localePadrao);
    }
}
