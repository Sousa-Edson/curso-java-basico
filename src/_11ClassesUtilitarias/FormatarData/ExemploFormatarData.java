package _11ClassesUtilitarias.FormatarData;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class ExemploFormatarData {
    public static void main(String[] args) {
        // Criando um objeto Date representando a data e hora atual
        Date dataAtual = new Date();

        // Obtendo o formato de data e hora padrão para o Locale padrão
        DateFormat formatoPadrao = DateFormat.getDateTimeInstance();
        String dataFormatada = formatoPadrao.format(dataAtual);

        System.out.println("Data formatada (Padrão): " + dataFormatada);
    }
}
