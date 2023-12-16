package _02ControleLoops.Continue;

public class ExemploContinueWhile {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            if (i == 2) {
                System.out.println("Pulando a iteração quando i é igual a 2.");
                i++;
                continue;
            }

            System.out.println("Valor de i: " + i);
            i++;
        }
    }
}
