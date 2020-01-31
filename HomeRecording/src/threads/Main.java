package threads;

public class Main {

	public static void main(String[] args) {
		
		Runnable action = () -> a();
		
		Thread thread1 = new Thread(action);
		thread1.setName("Avner");
		Thread thread2 = new Thread(action);
		thread2.setName("Itay");
		
		thread1.start();
		thread2.start();
		
	}
	
	public static synchronized void a() {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Out");
	}

}
