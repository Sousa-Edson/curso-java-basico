package _11ClassesUtilitarias.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExemploBigDecimalDivisao {
    public static void main(String[] args) {
        // Criando BigDecimal
        BigDecimal dividendo = new BigDecimal("10");
        BigDecimal divisor = new BigDecimal("3");

        // Realizando divisão com precisão e arredondamento
        BigDecimal resultado = dividendo.divide(divisor, 2, RoundingMode.HALF_UP);

        // Exibindo resultado
        System.out.println("Resultado da Divisão: " + resultado);
    }
}
