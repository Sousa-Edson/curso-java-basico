package _09Thread.ResumeSuspendStop;

class ExemploSuspend extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Contagem: " + i);
			try {
				Thread.sleep(1000); // aguarda 1 segundo
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ExemploSuspend myThread = new ExemploSuspend();

		// Inicia a thread
		myThread.start();

		// Aguarda 2 segundos
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Tenta suspender a execução da thread (não é recomendado)
		myThread.suspend();
	}
}
