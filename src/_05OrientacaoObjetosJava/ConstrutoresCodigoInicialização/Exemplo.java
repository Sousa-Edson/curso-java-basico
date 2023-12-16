package _05OrientacaoObjetosJava.ConstrutoresCodigoInicialização;

public class Exemplo {
    private static int contador;

    // Código de Inicialização
    static {
        contador = 0;
        System.out.println("Código de Inicialização executado.");
    }

    // Construtor
    public Exemplo() {
        contador++;
    }

    public static int getContador() {
        return contador;
    }
}
