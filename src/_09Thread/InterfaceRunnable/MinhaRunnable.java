package _09Thread.InterfaceRunnable;

//Implementação da interface Runnable
class MinhaRunnable implements Runnable {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println(Thread.currentThread().getId() + " - Contador: " + i);
     }
 }
}
