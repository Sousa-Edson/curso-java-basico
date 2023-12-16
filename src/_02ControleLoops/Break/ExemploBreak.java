package _02ControleLoops.Break;

public class ExemploBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

            if (i == 5) {
                System.out.println("Encontrou o número 5. Saindo do loop.");
                break;
            }
        }
    }
}
