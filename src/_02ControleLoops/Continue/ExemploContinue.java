package _02ControleLoops.Continue;

public class ExemploContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                // Pula para a próxima iteração se i for par
                continue;
            }

            System.out.println(i);
        }
    }
}
