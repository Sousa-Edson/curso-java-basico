package _02ControleLoops.While;

public class SomaImpares {
    public static void main(String[] args) {
        int limite = 10;
        int soma = 0;
        int numero = 1;

        while (numero <= limite) {
            soma += numero;
            numero += 2;
        }

        System.out.println("Soma dos ímpares até " + limite + ": " + soma);
    }
}
