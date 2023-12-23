package _11ClassesUtilitarias.BigInteger;

import java.math.BigInteger;

public class ExemploBigInteger {
    public static void main(String[] args) {
        // Criando BigInteger
        BigInteger numero1 = new BigInteger("12345678901234567890");
        BigInteger numero2 = new BigInteger("98765432109876543210");

        // Realizando operações
        BigInteger resultado = numero1.multiply(numero2);

        // Exibindo resultado
        System.out.println("Resultado da Multiplicação: " + resultado);
    }
}
