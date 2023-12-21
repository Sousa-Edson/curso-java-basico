package _09Thread.NotifyWaitNotifyAll;

public class ExemploNotifyAll {
    private boolean condicao = false;

    public synchronized void aguardarCondicao() throws InterruptedException {
        while (!condicao) {
            System.out.println("Thread em espera");
            wait(); // Aguarda até que outra thread chame notify() ou notifyAll()
        }
        System.out.println("Thread acordou e continuou a execução");
    }

    public synchronized void mudarCondicao() {
        condicao = true;
        notifyAll(); // Acorda todas as threads que estão esperando
    }

    public static void main(String[] args) {
        ExemploNotifyAll exemplo = new ExemploNotifyAll();

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

        Thread thread3 = new Thread(() -> {
            try {
                exemplo.aguardarCondicao();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread3.start(); // Ambas ficarão em espera até que thread2 chame mudarCondicao()
        thread2.start();
    }
}
