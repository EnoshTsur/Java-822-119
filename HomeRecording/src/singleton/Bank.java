package singleton;

public class Bank {

	private static Bank instance = null;
	
	private Bank() {}
	
	public synchronized static Bank getInstance() {
		if(instance == null) {
			instance = new Bank();
		}
		return instance;
	}
}
