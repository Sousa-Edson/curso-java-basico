package _09Thread;

public class ExemploThread2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MinhaRunnable());
		Thread t2 = new Thread(new MinhaRunnable());

		t1.start();
		t2.start();
	}
}