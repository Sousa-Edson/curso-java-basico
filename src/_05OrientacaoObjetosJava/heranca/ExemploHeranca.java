package _05OrientacaoObjetosJava.heranca;

public class ExemploHeranca {
	public static void main(String[] args) {
		Cachorro meuCachorro = new Cachorro();
		meuCachorro.nome = "Bolinha";
		meuCachorro.idade = 3;

		meuCachorro.fazerBarulho(); // Herdado de Animal
		meuCachorro.latir(); // Método específico de Cachorro
	}
}
