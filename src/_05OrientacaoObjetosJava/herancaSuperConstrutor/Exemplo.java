package _05OrientacaoObjetosJava.herancaSuperConstrutor;

public class Exemplo {

	public static void main(String[] args) {
		Cachorro meuCachorro = new Cachorro("Grande", "Pudle");
		System.out.println(meuCachorro);

		System.out.println(new Cachorro("dração", "fogo"));
	}
}
