package _11ClassesUtilitarias.BigDecimal;

import java.math.BigDecimal;

public class ExemploBigDecimal {
    public static void main(String[] args) {
        // Criando BigDecimal
        BigDecimal numero1 = new BigDecimal("1234.5678");
        BigDecimal numero2 = new BigDecimal("9876.5432");

        // Realizando operações
        BigDecimal resultado = numero1.add(numero2);

        // Exibindo resultado
        System.out.println("Resultado da Adição: " + resultado);
    }
}
