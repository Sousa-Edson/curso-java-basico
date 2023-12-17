package _08Escopo;

public class ExemploEscopoTryCatch {
    public static void main(String[] args) {
        try {
            int valor = Integer.parseInt("123");
            System.out.println(valor);
        } catch (NumberFormatException e) {
//             System.out.println(valor); // Erro: valor não é visível aqui
        }
    }
}
