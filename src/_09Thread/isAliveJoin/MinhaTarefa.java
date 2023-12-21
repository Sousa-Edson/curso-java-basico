package _09Thread.isAliveJoin;

class MinhaTarefa implements Runnable {
    private String mensagem;

    public MinhaTarefa(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(mensagem + " - Contador: " + i);
            try {
                // Dorme por um curto período para simular uma tarefa demorada
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


