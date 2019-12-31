package cars;

public class Main {

	public static void main(String[] args) {
		Thread car1 = new Car("Kobi");
		Thread car2 = new Car("Itay");
		
		car1.start();
		car2.start();

	}

}
