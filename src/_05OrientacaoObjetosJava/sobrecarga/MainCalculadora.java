package _05OrientacaoObjetosJava.sobrecarga;

public class MainCalculadora {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int resultado1 = calc.somar(5, 10);
		double resultado2 = calc.somar(3.5, 7.2);
		int resultado3 = calc.somar(2, 4, 6);

		System.out.println("Resultado::"+resultado1);
		System.out.println("Resultado::"+resultado2);
		System.out.println("Resultado::"+resultado3);
	}
}
