package _09Thread;

public class Teste {

	public static void main(String[] args) {

		MinhaThreadEx thread = new MinhaThreadEx("Thread #1", 600);
//		 thread.start();
		
		MinhaThreadEx thread2 = new MinhaThreadEx("Thread #2", 900);

		MinhaThreadEx thread3 = new MinhaThreadEx("Thread #3", 500);
		
//		thread.run();
//		thread2.run();
//		thread3.run();

	}

}