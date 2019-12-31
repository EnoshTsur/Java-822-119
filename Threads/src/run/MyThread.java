package run;

import java.util.concurrent.TimeUnit;

public class MyThread extends Thread {

	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		
		try {
			Thread.sleep(TimeUnit.SECONDS.toMillis(2));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("My Thread");
	}

	
}
