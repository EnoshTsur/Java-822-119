package task;

public class TaksMain {

	public static void main(String[] args) {
		Worker worker = new Worker("Itsik", 1, 32, 4);
		Driver driver = new Driver("Iftach", 2, 23, "O");
		
		worker.printWorker();
		System.out.println("-------------------------");
		driver.printDriver();

	}

}
