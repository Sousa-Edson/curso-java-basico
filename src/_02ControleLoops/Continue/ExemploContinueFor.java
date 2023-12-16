package _02ControleLoops.Continue;

public class ExemploContinueFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Pulando a iteração quando i é igual a 3.");
                continue;
            }

            System.out.println("Valor de i: " + i);
        }
    }
}
