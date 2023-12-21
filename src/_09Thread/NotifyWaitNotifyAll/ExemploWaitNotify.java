package _09Thread.NotifyWaitNotifyAll;

public class ExemploWaitNotify {
	private boolean condicao = false;

	public synchronized void aguardarCondicao() throws InterruptedException {
		while (!condicao) {
			System.out.println("Thread em espera");
			wait(); // Aguarda até que outra thread chame notify()
		}
		System.out.println("Thread acordou e continuou a execução");
	}

	public synchronized void mudarCondicao() {
		condicao = true;
		notify(); // Acorda a thread que está esperando
	}

	public static void main(String[] args) {
		ExemploWaitNotify exemplo = new ExemploWaitNotify();

		Thread thread1 = new Thread(() -> {
			try {
				exemplo.aguardarCondicao();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread thread2 = new Thread(() -> {
			exemplo.mudarCondicao();
		});

		thread1.start();
		thread2.start();
	}
}
