package _08ClasseInterna;

public class Exemplo {
	public static void main(String[] args) {
		MinhaInterface instancia = new MinhaInterface() {
			public void meuMetodo() {
				System.out.println("Implementação anônima");
			}
		};
		instancia.meuMetodo();
	}
}
