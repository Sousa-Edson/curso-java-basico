package _11ClassesUtilitarias.DecimalFormat;

import java.text.DecimalFormat;

public class ExemploDecimalFormat {
    public static void main(String[] args) {
        // Criando um padrão para formatar números com duas casas decimais
        DecimalFormat formato = new DecimalFormat("#,##0.00");

        // Formatando um número inteiro
        int numeroInteiro = 1234567;
        String numeroFormatadoInteiro = formato.format(numeroInteiro);
        System.out.println("Número Inteiro Formatado: " + numeroFormatadoInteiro);

        // Formatando um número decimal
        double numeroDecimal = 12345.6789;
        String numeroFormatadoDecimal = formato.format(numeroDecimal);
        System.out.println("Número Decimal Formatado: " + numeroFormatadoDecimal);
    }
}
