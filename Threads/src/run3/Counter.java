package run3;

public class Counter {
	
	private int value = 0;
	
	public void increament() {
		synchronized (this) {
			value++;			
		}
	}

	public int getValue() { return value; }
}
