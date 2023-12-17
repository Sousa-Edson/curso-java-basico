package _07Enumeradores;

public class MainStatus {
	public static void main(String[] args) {
		Status status = Status.PENDENTE;
		System.out.println("Status: " + status); // Imprime: PENDENTE
		System.out.println("Descrição: " + status.getDescricao()); // Imprime: Aguardando Processamento

	}
}
