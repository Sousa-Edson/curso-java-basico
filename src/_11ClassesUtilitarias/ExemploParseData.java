package _11ClassesUtilitarias;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploParseData {
    public static void main(String[] args) {
        String dataString = "25/12/2023 15:30:00";
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        try {
            // Parse da string para um objeto Date
            Date dataParseada = formato.parse(dataString);
            System.out.println("Data parseada: " + dataParseada);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
