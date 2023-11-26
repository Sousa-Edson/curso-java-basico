package programacaoBasica;

 
import java.util.Scanner;

public class CadastroEstudante {
    public static void main(String[] args) {
        // Criação de uma instância de Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite seu nome
        System.out.print("Digite o nome do estudante: ");
        String nome = scanner.nextLine();

        // Solicita ao usuário que digite sua idade
        System.out.print("Digite a idade do estudante: ");
        int idade = scanner.nextInt();

        // Solicita ao usuário que digite a média do estudante
        System.out.print("Digite a média do estudante: ");
        double media = scanner.nextDouble();

        // Exibe as informações do estudante
        System.out.println("\nInformações do Estudante:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Média: " + media);

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
