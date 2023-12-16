package _05OrientacaoObjetosJava.ClassesMetodosComRetorno;

public class Calculadora {
	public int somar(int a, int b) {
        return a + b;
    }

    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: Divisão por zero.");
            return Double.NaN; // NaN (Not a Number) indica um valor indefinido.
        }
    }
}
