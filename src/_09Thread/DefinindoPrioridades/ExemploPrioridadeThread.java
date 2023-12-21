package _09Thread.DefinindoPrioridades;

public class ExemploPrioridadeThread {
    public static void main(String[] args) {
        // Criando instâncias de tarefas
        MinhaTarefa tarefa1 = new MinhaTarefa("Thread 1");
        MinhaTarefa tarefa2 = new MinhaTarefa("Thread 2");

        // Criando threads e associando tarefas a elas
        Thread thread1 = new Thread(tarefa1);
        Thread thread2 = new Thread(tarefa2);

        // Definindo prioridades
        thread1.setPriority(Thread.MAX_PRIORITY); // Prioridade máxima
        thread2.setPriority(Thread.MIN_PRIORITY); // Prioridade mínima

        // Iniciando as threads
        thread1.start();
        thread2.start();

        System.out.println("Prioridade da Thread 1: " + thread1.getPriority());
        System.out.println("Prioridade da Thread 2: " + thread2.getPriority());

        System.out.println("Programa principal terminou.");
    }
}