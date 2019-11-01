package flow;

public class IfExercise {

	public static void main(String[] args) {
		int age = (int) (Math.random() * 50) + 10;
//
		if (age < 18) {
			System.out.printf("Age: %d, Can't drive...", age);
		} else if (age >= 18 && age < 21) {
			System.out.printf("Age: %d, Army Driver...", age);
		} else if (age >= 21 && age < 24) {
			System.out.printf("Age: %d, Travel to India", age);
		} else {
			System.out.printf("Age: %d, Ping pong player!", age);
		}

	}

}
