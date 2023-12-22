package _09Thread.ResumeSuspendStop;

class ExemploResume extends Thread {
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
        ExemploResume myThread = new ExemploResume();

        // Inicia a thread
        myThread.start();

        // Aguarda 3 segundos
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Tenta retomar a execução da thread (não é recomendado)
        myThread.resume();
    }
}

