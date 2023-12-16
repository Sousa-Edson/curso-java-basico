package _05OrientacaoObjetosJava.palavrachaveThis;

public class Carro {
	private String modelo;

	public Carro(String modelo) {
		this.modelo = modelo;
	}

	public void exibirModelo() {
		System.out.println("Modelo: " + this.modelo);
	}

	public void realizarManutencao() {
		// Passando a própria instância do objeto para outro método
		ServicoManutencao.realizar(this);
	}
}
