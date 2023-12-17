package _08Escopo;

public class ExemploEscopo {
    public static void main(String[] args) {
        int x = 10;

        if (x > 5) {
            int y = 20; // Escopo dentro do bloco if
            System.out.println(x + y);
        }

//         System.out.println(y); // Erro: y não é visível aqui
    }
}
