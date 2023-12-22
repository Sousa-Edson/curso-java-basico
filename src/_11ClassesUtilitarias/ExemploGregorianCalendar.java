package _11ClassesUtilitarias;

import java.util.GregorianCalendar;

public class ExemploGregorianCalendar {
    public static void main(String[] args) {
        // Criando uma instância de GregorianCalendar representando a data atual
        GregorianCalendar calendarioAtual = new GregorianCalendar();

        // Obtendo informações de data
        int ano = calendarioAtual.get(GregorianCalendar.YEAR);
        int mes = calendarioAtual.get(GregorianCalendar.MONTH) + 1; // Janeiro é representado por 0
        int dia = calendarioAtual.get(GregorianCalendar.DAY_OF_MONTH);

        // Obtendo informações de hora
        int hora = calendarioAtual.get(GregorianCalendar.HOUR_OF_DAY);
        int minuto = calendarioAtual.get(GregorianCalendar.MINUTE);
        int segundo = calendarioAtual.get(GregorianCalendar.SECOND);

        // Exibindo informações de data e hora
        System.out.println("Data atual: " + dia + "/" + mes + "/" + ano);
        System.out.println("Hora atual: " + hora + ":" + minuto + ":" + segundo);
    }
}
