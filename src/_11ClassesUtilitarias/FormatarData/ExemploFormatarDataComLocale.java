package _11ClassesUtilitarias.FormatarData;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class ExemploFormatarDataComLocale {
    public static void main(String[] args) {
        // Criando um objeto Date representando a data e hora atual
        Date dataAtual = new Date();

        // Criando um Locale específico (francês na França)
        Locale localeFranca = new Locale("fr", "FR");

        // Obtendo o formato de data curta para o Locale específico
        DateFormat formatoEspecifico = DateFormat.getDateInstance(DateFormat.SHORT, localeFranca);
        String dataFormatada = formatoEspecifico.format(dataAtual);

        System.out.println("Data formatada (França): " + dataFormatada);
    }
}
