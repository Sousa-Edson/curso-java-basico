package _05OrientacaoObjetosJava.classeAbstrata;

public class ExemploHeranca {

	public static void main(String[] args) {
		// Não podemos criar uma instância de Animal diretamente
		// Animal animal = new Animal(); // Isso geraria um erro de compilação

		// Podemos criar uma instância de Cachorro, que é uma subclasse de Animal
		Cachorro cachorro = new Cachorro();
		cachorro.fazerSom(); // Saída: Au au!
		cachorro.dormir(); // Saída: Zzz...
	}
}