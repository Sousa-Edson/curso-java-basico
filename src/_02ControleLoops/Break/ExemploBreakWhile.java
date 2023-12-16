package _02ControleLoops.Break;

public class ExemploBreakWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);

            if (i == 5) {
                System.out.println("Encontrou o número 5. Saindo do loop.");
                break;
            }

            i++;
        }
    }
}
