package _11ClassesUtilitarias;

public class ExemploClasseMath {
    public static void main(String[] args) {
        int soma = Math.addExact(5, 3); // 8
        int diferenca = Math.subtractExact(10, 4); // 6
        int produto = Math.multiplyExact(2, 3); // 6

        double raizQuadrada = Math.sqrt(25.0); // 5.0
        double raizCubica = Math.cbrt(27.0); // 3.0
        double potencia = Math.pow(2.0, 3.0); // 8.0

        double seno = Math.sin(Math.toRadians(30.0)); // 0.5
        double cosseno = Math.cos(Math.toRadians(60.0)); // 0.5
        double tangente = Math.tan(Math.toRadians(45.0)); // 1.0

        double logNatural = Math.log(Math.E); // 1.0
        double logBase10 = Math.log10(1000.0); // 3.0

        System.out.println("Soma: " + soma);
        System.out.println("Diferença: " + diferenca);
        System.out.println("Produto: " + produto);

        System.out.println("Raiz Quadrada: " + raizQuadrada);
        System.out.println("Raiz Cúbica: " + raizCubica);
        System.out.println("Potência: " + potencia);

        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);

        System.out.println("Logaritmo Natural: " + logNatural);
        System.out.println("Logaritmo na Base 10: " + logBase10);
    }
}
