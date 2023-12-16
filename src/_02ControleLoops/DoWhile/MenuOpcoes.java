package _02ControleLoops.DoWhile;

import java.util.Scanner;

public class MenuOpcoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Imprimir Olá");
            System.out.println("2. Imprimir Tchau");
            System.out.println("3. Sair");
            System.out.print("Digite sua escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Olá!");
                    break;
                case 2:
                    System.out.println("Tchau!");
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }
}
