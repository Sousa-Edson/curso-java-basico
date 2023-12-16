package _02ControleLoops.Continue;

public class ExemploContinueRotulado {
    public static void main(String[] args) {
        externo: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Pulando a iteração quando i=2 e j=2.");
                    continue externo;
                }

                System.out.println("Valor de i: " + i + ", Valor de j: " + j);
            }
        }
    }
}
