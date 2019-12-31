package bs;

public class Bank {
	
	private static Bank instance = null;

	private Bank() {}
	
	public static Bank getInstance() {
		if (instance == null) {
			instance = new Bank();
		}
		return instance;
		
	}
	
}
