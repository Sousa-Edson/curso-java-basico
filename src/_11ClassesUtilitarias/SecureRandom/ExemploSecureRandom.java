package _11ClassesUtilitarias.SecureRandom;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class ExemploSecureRandom {
    public static void main(String[] args) {
        try {
            // Criando uma instância de SecureRandom
            SecureRandom secureRandom = SecureRandom.getInstanceStrong();

            // Gerando um número aleatório
            byte[] bytesAleatorios = new byte[16];
            secureRandom.nextBytes(bytesAleatorios);

            // Exibindo os bytes aleatórios (representação hexadecimal)
            System.out.print("Bytes Aleatórios: ");
            for (byte b : bytesAleatorios) {
                System.out.print(String.format("%02X", b));
            }
            System.out.println();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
