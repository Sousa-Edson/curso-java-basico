package _09Thread.InterfaceRunnable;

class Tarefa implements Runnable {
    private String mensagem;

    // Construtor para receber uma mensagem
    public Tarefa(String mensagem) {
        this.mensagem = mensagem;
    }

    // Implementação do método run
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(mensagem);
            try {
                // Dorme por um curto período para simular uma tarefa demorada
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


