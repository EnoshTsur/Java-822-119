package run3;

public class Lambda {

	public static void main(String[] args) {
		
		Thread ex = new Extends();
		ex.start();
		
		Thread imp = new Thread(new Implements());
		imp.start();
		
		Thread anony = new Thread(new Runnable() {
			
			@Override
			public void run() {
			System.out.println("asdhgasd");	
			}
		});
		
		anony.start();
		
		Thread lambda = new Thread(() -> {
			System.out.println("asdasd");
		});
		
		OneMethod one = () -> System.out.println("asdasd");
		
	}

}



@FunctionalInterface
interface OneMethod {
	
	void run();

}

class Implements implements Runnable {

	@Override
	public void run() {
		System.out.println("asdj");
	}
	
}

class Extends extends Thread {
	
	@Override
	public void run() {
		System.out.println("asdfajsdhas");
	}
}
