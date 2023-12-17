package _05OrientacaoObjetosJava._interfaces;

public class Main1 {
	public static void main(String[] args) {
		// Exemplo de upcasting
		Animal animal = new Cachorro(); // Cachorro é uma subclasse de Animal
		animal.fazerSom(); // Chama o método específico de Cachorro (se existir)

		// Exemplo de downcasting
		if (animal instanceof Cachorro) {
		    Cachorro cachorro = (Cachorro) animal;
		    cachorro.brincar();
		}

	}

}
