package _05OrientacaoObjetosJava.relacionamentoTemUm;

public class Main {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Rosalia");
		pessoa.setIdade(38);

		Endereco endereco = new Endereco();
		endereco.setCidade("Barueri");
		endereco.setEstado("São Paulo");
		endereco.setRua("Rua Carlos , numero 123");

		pessoa.setEndereco(endereco);
		
		System.out.println(pessoa);
	}
}
