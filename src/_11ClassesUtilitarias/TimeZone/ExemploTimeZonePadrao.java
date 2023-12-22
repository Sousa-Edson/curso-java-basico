package _11ClassesUtilitarias.TimeZone;

import java.util.TimeZone;

public class ExemploTimeZonePadrao {
    public static void main(String[] args) {
        // Obtendo o fuso horário padrão do sistema
        TimeZone fusoPadrao = TimeZone.getDefault();
        System.out.println("Fuso Horário Padrão: " + fusoPadrao.getID());
    }
}
