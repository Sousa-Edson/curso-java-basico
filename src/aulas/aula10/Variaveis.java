package aulas.aula10;

public class Variaveis {
	public static void main(String[] args) {

		// convenção Java
		int idade = 20;
		String nome = "David";
		String nomeDoMeuCachorro = "caramelo";
		String ano2023 = "2023";

		// aceito, mas não utilizado
		int _idade;
		int $idade;

		// não é convenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;

		idade = 25;

		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);

		// má prática
		int a = 10;
		String b = "Edson";
	}
}