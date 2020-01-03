package run4;

public class Bank {

	private static Bank instance = null;
	
	private Bank() {}
	
	public synchronized static Bank getInstace() {
		if(instance == null) {
			instance = new Bank();
		}
		return instance;
	}
}
