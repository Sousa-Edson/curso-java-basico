package _09Thread.ResumeSuspendStop;

class ExemploStop extends Thread {
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
        ExemploStop myThread = new ExemploStop();

        // Inicia a thread
        myThread.start();

        // Aguarda 2 segundos
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Tenta parar permanentemente a execução da thread (não é recomendado)
        myThread.stop();
    }
}
