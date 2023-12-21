package _09Thread.isAliveJoin;

public class ExemploMultiThread {
	public static void main(String[] args) {
		// Criando instâncias de tarefas
		MinhaTarefa tarefa1 = new MinhaTarefa("Thread 1");
		MinhaTarefa tarefa2 = new MinhaTarefa("Thread 2");

		// Criando threads e associando tarefas a elas
		Thread thread1 = new Thread(tarefa1);
		Thread thread2 = new Thread(tarefa2);

		// Iniciando as threads
		thread1.start();
		thread2.start();

		// Verificando se as threads estão vivas
		System.out.println("Thread 1 está viva? " + thread1.isAlive());
		System.out.println("Thread 2 está viva? " + thread2.isAlive());

		try {
			// Aguardando o término da Thread 1 antes de continuar
			thread1.join();
			System.out.println("Thread 1 terminou.");

			// Aguardando o término da Thread 2 antes de continuar
			thread2.join();
			System.out.println("Thread 2 terminou.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Verificando novamente se as threads estão vivas
		System.out.println("Thread 1 está viva? " + thread1.isAlive());
		System.out.println("Thread 2 está viva? " + thread2.isAlive());

		System.out.println("Programa principal terminou.");
	}
}
