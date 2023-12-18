package _09Thread;

public class ExemploThread extends Thread {
    public static void main(String[] args) {
        // Criando instâncias da classe ExemploThread
        ExemploThread thread1 = new ExemploThread("Thread 1");
        ExemploThread thread2 = new ExemploThread("Thread 2");

        // Iniciando as threads usando o método start
        thread1.start();
        thread2.start();
    }

    private final String nome;

    public ExemploThread(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(nome + ": Contagem " + i);

            try {
                // Simula um atraso de 1 segundo
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(nome + ": Thread concluída.");
    }
}
