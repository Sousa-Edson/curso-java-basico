package _11ClassesUtilitarias.DecimalFormat;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class ExemploDecimalFormatMoeda {
    public static void main(String[] args) {
        // Criando um padrão para formatar valores em moeda
        DecimalFormat formatoMoeda = new DecimalFormat("¤#,##0.00");
        DecimalFormat formatoMoedaBrasil = new DecimalFormat("¤#,##0.0000");

        // Obtendo os símbolos de moeda para o locale padrão
        DecimalFormatSymbols simbolosMoeda = DecimalFormatSymbols.getInstance();
        DecimalFormatSymbols simbolosMoedaBrasil = DecimalFormatSymbols.getInstance();

        // Definindo o símbolo de moeda para o euro (€)
        simbolosMoeda.setCurrencySymbol("€");
        formatoMoeda.setDecimalFormatSymbols(simbolosMoeda);
        
        // Definindo o símbolo de moeda para o R$ (R$)
        simbolosMoedaBrasil.setCurrencySymbol("R$");
        formatoMoedaBrasil.setDecimalFormatSymbols(simbolosMoedaBrasil);

        // Formatando um valor em moeda
        double valorMoeda = 12345.6789;
        String valorFormatadoMoeda = formatoMoeda.format(valorMoeda);
        String valorFormatadoMoedaBrasil = formatoMoedaBrasil.format(valorMoeda);
        
        System.out.println("Valor Formatado em Moeda: " + valorFormatadoMoeda);
        System.out.println("Valor Formatado em Moeda: " + valorFormatadoMoedaBrasil);
    }
}
