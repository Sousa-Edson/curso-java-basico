package _09Thread.Synchronized;

public class ExemploSincronizacaoBloco {
	private int contador = 0;
	private Object lock = new Object(); // Objeto usado como lock

	public void incrementarContador() {
		// Bloco sincronizado usando um objeto de lock
		synchronized (lock) {
			contador++;
			System.out.println("Contador: " + contador + " - Thread: " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		ExemploSincronizacaoBloco exemplo = new ExemploSincronizacaoBloco();

		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				exemplo.incrementarContador();
			}
		});

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				exemplo.incrementarContador();
			}
		});

		thread1.start();
		thread2.start();
	}
}
