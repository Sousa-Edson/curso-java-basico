package _05OrientacaoObjetosJava.ClassesMetodosSimples;

public class Retangulo {
	// Atributos
	double comprimento;
	double largura;

	// Método para calcular área
	double calcularArea() {
		return comprimento * largura;
	}

	public static void main(String[] args) {
		// Criando objeto da classe Retangulo
		Retangulo retangulo = new Retangulo();
		retangulo.comprimento = 5.0;
		retangulo.largura = 3.0;

		// Chamando método para calcular a área
		double area = retangulo.calcularArea();

		// Exibindo resultado
		System.out.println("Área do retângulo: " + area);
	}
}
