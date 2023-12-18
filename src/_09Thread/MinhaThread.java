package _09Thread;

class MinhaThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getId() + " - Contador: " + i);
		}
	}
}
