package cars;

public class Car extends Thread {
	
	private String name;
	private int speed = (int)(Math.random() * 20) + 1;;
	
	public static final int DESTINATION =  300;
	
	public Car(String name) {
		this.name = name;
	}


	@Override
	public void run() {
		int startPoint = 0;
		while(startPoint < DESTINATION) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(name + ": " +  startPoint);
			startPoint += speed;
		}
		
		System.out.println("Finished: " + name);
	}

}
