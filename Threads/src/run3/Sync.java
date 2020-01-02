package run3;

public class Sync {

	public static void main(String[] args) {
	
		Counter counter = new Counter();
		counter.increament();
		
		Runnable runnable = () -> {
			
			for (int i = 0; i < 1000; i++) {
				counter.increament();
			}
			
		};
		
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		
		System.out.println(counter.getValue());

	}

}
