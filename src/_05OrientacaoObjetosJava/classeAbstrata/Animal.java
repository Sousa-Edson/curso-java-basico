package _05OrientacaoObjetosJava.classeAbstrata;

//Classe abstrata
abstract class Animal {
	// Método abstrato
	public abstract void fazerSom();

	// Método não abstrato
	public void dormir() {
		System.out.println("Zzz...");
	}
}