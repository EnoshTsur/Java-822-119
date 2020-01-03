package run3;

public class Sync2 {

	public static void main(String[] args) {
	
		Counter counter = new Counter();
		counter.increament();
		
		Thread thread1 = new Thread(new Action(counter));
		Thread thread2 = new Thread(new Action(counter));
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		System.out.println(counter.getValue());

	}

}
