package _05OrientacaoObjetosJava.conceitosClasse;

//Exemplo de uso
public class ExemploCarro {
	public static void main(String[] args) {
		// Criando objetos da classe Carro
		Carro carro1 = new Carro();
		carro1.marca = "Toyota";
		carro1.modelo = "Corolla";
		carro1.ano = 2022;

		Carro carro2 = new Carro();
		carro2.marca = "Honda";
		carro2.modelo = "Civic";
		carro2.ano = 2021;

		// Chamando o método para exibir informações
		carro1.exibirInfo();
		carro2.exibirInfo();
	}
}