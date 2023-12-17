package _05OrientacaoObjetosJava.palavraChaveFinal;

public class ExemploFinal {

    public static void main(String[] args) {
        final int numero = 10;
        //numero = 20; // Isso resultaria em um erro de compilação, pois 'numero' é final.
        System.out.println(numero);
    }
}
