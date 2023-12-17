package _06Exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExemploManipulacaoLista {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            List<String> nomes = new ArrayList<>();

            // Adiciona alguns nomes à lista
            nomes.add("Alice");
            nomes.add("Bob");
            nomes.add("Charlie");

            // Solicita ao usuário que digite um índice
            System.out.print("Digite um índice para obter um nome da lista: ");
            int indice = scanner.nextInt();

            // Obtém e exibe o nome no índice especificado
            String nome = obterNome(nomes, indice);
            System.out.println("O nome no índice " + indice + " é: " + nome);

        } catch (InputMismatchException e) {
            System.err.println("Entrada inválida. Por favor, digite um número inteiro.");
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Erro: Índice fora dos limites da lista.");
        } catch (Exception e) {
            System.err.println("Ocorreu uma exceção: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static String obterNome(List<String> nomes, int indice) {
        // Lança IndexOutOfBoundsException se o índice estiver fora dos limites
        return nomes.get(indice);
    }
}
