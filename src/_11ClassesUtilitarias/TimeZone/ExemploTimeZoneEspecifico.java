package _11ClassesUtilitarias.TimeZone;

import java.util.TimeZone;

public class ExemploTimeZoneEspecifico {
    public static void main(String[] args) {
        // Obtendo o fuso horário para Nova Iorque (Eastern Time)
        TimeZone fusoNY = TimeZone.getTimeZone("America/New_York");

        // Exibindo informações do fuso horário
        System.out.println("ID do Fuso Horário: " + fusoNY.getID());
        System.out.println("Deslocamento de UTC: " + fusoNY.getRawOffset() / (60 * 60 * 1000) + " horas");
        System.out.println("Utiliza Horário de Verão: " + fusoNY.observesDaylightTime());
    }
}
