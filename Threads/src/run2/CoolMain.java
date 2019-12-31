package run2;

public class CoolMain {
	
	public static void main(String[] args) {
		
//		Thread thread = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				try {
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				System.out.println("Hi!!");
//			}
//		});
//		
//		thread.start();
		
		Runnable coolOne = () -> {
			System.out.println("Hi");
		};
		
		Thread thread = new Thread(() -> {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hi!!");
		});
		
		thread.start();
	}

}
