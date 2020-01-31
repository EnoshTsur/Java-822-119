package threads;

import java.util.concurrent.TimeUnit;

public class PrintHi extends Thread {
	
	@Override
	public void run() {
		try {
			Thread.sleep(TimeUnit.SECONDS.toMillis(3));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("hi");
	}

}
