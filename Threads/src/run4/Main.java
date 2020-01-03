package run4;

public class Main {

	public static void main(String[] args) {
		
		Runnable action = new Runnable() {
			
			@Override
			public void run() {
				Bank b = Bank.getInstace();
			}
		};
		
		Thread t1 = new Thread(action);
		Thread t2 = new Thread(action);
		

	}

}
