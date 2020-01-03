package run3;

public class Action implements Runnable {
	
	private Counter counter;
	
	public Action(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			counter.increament();
		}
	}

}
