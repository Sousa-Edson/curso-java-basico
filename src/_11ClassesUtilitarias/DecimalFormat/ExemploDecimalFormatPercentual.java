package _11ClassesUtilitarias.DecimalFormat;

import java.text.DecimalFormat;

public class ExemploDecimalFormatPercentual {
    public static void main(String[] args) {
        // Criando um padrão para formatar números como percentuais
        DecimalFormat formatoPercentual = new DecimalFormat("0.00%");

        // Formatando um valor como percentual
        double valorPercentual = 0.456;
        String valorFormatadoPercentual = formatoPercentual.format(valorPercentual);
        System.out.println("Valor Formatado como Percentual: " + valorFormatadoPercentual);
    }
}
