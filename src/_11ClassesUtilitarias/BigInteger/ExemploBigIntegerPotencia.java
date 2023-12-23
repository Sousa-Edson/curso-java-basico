package _11ClassesUtilitarias.BigInteger;

import java.math.BigInteger;

public class ExemploBigIntegerPotencia {
    public static void main(String[] args) {
        // Criando BigInteger
        BigInteger base = new BigInteger("2");
        BigInteger expoente = new BigInteger("10");

        // Calculando potência
        BigInteger resultado = base.pow(expoente.intValue());

        // Exibindo resultado
        System.out.println("2^10 (Potência): " + resultado);
    }
}
