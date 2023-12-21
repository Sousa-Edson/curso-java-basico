package _09Thread.InterfaceRunnable;

public class ExemploThreadRunnable {
	public static void main(String[] args) {
		// Criando instâncias da classe que implementa Runnable
		Runnable tarefa1 = new Tarefa("Thread 1 - Olá");
		Runnable tarefa2 = new Tarefa("Thread 2 - Mundo");

		// Criando threads e associando tarefas a elas
		Thread thread1 = new Thread(tarefa1);
		Thread thread2 = new Thread(tarefa2);

		// Iniciando as threads
		thread1.start();
		thread2.start();
	}
}