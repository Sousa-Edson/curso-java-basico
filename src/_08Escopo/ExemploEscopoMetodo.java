package _08Escopo;

public class ExemploEscopoMetodo {
    public static void main(String[] args) {
        int resultado = somar(5, 7);
//         System.out.println(soma); // Erro: soma não é visível aqui
    }

    public static int somar(int a, int b) {
        int soma = a + b; // Escopo dentro do método somar
        return soma;
    }
}

