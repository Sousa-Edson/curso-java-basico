package _09Thread.Deadlock;

public class ExemploDeadlock {
	// Recursos compartilhados
	static Object recurso1 = new Object();
	static Object recurso2 = new Object();

	public static void main(String[] args) {
		// Thread 1
		Thread thread1 = new Thread(() -> {
			synchronized (recurso1) {
				System.out.println("Thread 1: Bloqueou recurso 1");

				try {
					// Aguarda um curto período para simular algum processamento
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				synchronized (recurso2) {
					System.out.println("Thread 1: Bloqueou recurso 2");
				}
			}
		});

		// Thread 2
		Thread thread2 = new Thread(() -> {
			synchronized (recurso2) {
				System.out.println("Thread 2: Bloqueou recurso 2");

				try {
					// Aguarda um curto período para simular algum processamento
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				synchronized (recurso1) {
					System.out.println("Thread 2: Bloqueou recurso 1");
				}
			}
		});

		// Inicia as threads
		thread1.start();
		thread2.start();
	}
}
