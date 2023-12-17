package _08Printf;

public class Exemplo2 {
public static void main(String[] args) {
	// Alinhamento à direita em uma largura de 10 caracteres
	System.out.printf("%100s%n", "Java");

	// Alinhamento à esquerda em uma largura de 5 caracteres, preenchido com zeros
	System.out.printf("%-5d%n", 425);

	// Representação hexadecimal
	System.out.printf("Hexadecimal: %x%n", 255);

}
}
