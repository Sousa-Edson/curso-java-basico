package _07Enumeradores;

public class ExemploEnum3 {
	public static void main(String[] args) {
		// Uso do método abstrato
		for (Status2 status : Status2.values()) {
			System.out.println(status.getDescricao());
		}
		System.out.println("teste:: "+Status2.CONCLUIDO+" descrição:: "+Status2.CONCLUIDO.getDescricao());
	}
}