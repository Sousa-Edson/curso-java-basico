package _09Thread;

class MinhaRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " - Contador: " + i);
        }
    }
}


