package _05OrientacaoObjetosJava._interfaces;

public class Main2 {
public static void main(String[] args) {
	Animal animal = new Gato();

	// Verificando se animal é uma instância de Cachorro
	if (animal instanceof Cachorro) {
	    Cachorro cachorro = (Cachorro) animal;
	    cachorro.brincar();
	} else {
	    System.out.println("Não é um cachorro.");
	}

}
}
