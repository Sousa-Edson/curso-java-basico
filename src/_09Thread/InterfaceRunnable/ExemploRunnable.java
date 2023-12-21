package _09Thread.InterfaceRunnable;

public class ExemploRunnable {
    public static void main(String[] args) {
        // Cria uma instância da classe que implementa Runnable
        MinhaRunnable minhaRunnable = new MinhaRunnable();

        // Cria instâncias de Thread, passando o objeto Runnable no construtor
        Thread t1 = new Thread(minhaRunnable);
        Thread t2 = new Thread(minhaRunnable);

        // Inicia as threads
        t1.start();
        t2.start();
    }
}