package _11ClassesUtilitarias.FormatarData;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class ExemploAnalisarDataComLocale {
    public static void main(String[] args) {
        // String contendo uma data (formato curto) em francês
        String dataString = "23/12/2023";

        // Criando um Locale específico (francês na França)
        Locale localeFranca = new Locale("fr", "FR");

        // Obtendo o formato de data curta para o Locale específico
        DateFormat formatoEspecifico = DateFormat.getDateInstance(DateFormat.SHORT, localeFranca);

        try {
            // Analisando a string para obter um objeto Date
            Date dataAnalisada = formatoEspecifico.parse(dataString);
            System.out.println("Data analisada (França): " + dataAnalisada);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
