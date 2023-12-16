package _02ControleLoops.For;

public class CalculadoraComFor {
	public static void main(String[] args) {
		int resultado = 0;

		for (int i = 1; i <= 10; i++) {
			resultado += i;
		}

		System.out.println("A soma dos números de 1 a 10 é: " + resultado);
	}
}
