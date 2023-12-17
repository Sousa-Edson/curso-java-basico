package _07Enumeradores;

public class TesteEnumPlanetas {
	public static void main(String[] args) {
		Planeta planeta = Planeta.TERRA;

		System.out.println("Massa da Terra: " + planeta.getMassa() + " kg");
		System.out.println("Raio da Terra: " + planeta.getRaio() + " metros");

		double pesoNaTerra = 75.0; // kg
		double aceleracaoNaTerra = planeta.calcularAceleracaoGravitacional(pesoNaTerra);
		System.out.println("Aceleração Gravitacional na Terra para um peso de " + pesoNaTerra + " kg: "
				+ aceleracaoNaTerra + " m/s^2");
	}
}
