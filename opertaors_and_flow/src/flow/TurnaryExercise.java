package flow;

public class TurnaryExercise {

	public static void main(String[] args) {

		int age = (int) (Math.random() * 50) + 10;

		// Problem -> to many code :(

//		String message = "";
//		message = (1 < 3) ? "" : "";
//
//		if (age < 18) {
//			message = "Can't drive...";
//		}
//		System.out.printf("What ever... %s %d", message, age);

		String message = (age < 18) ? "18 message"
				: (age >= 18 && age < 21) ? "18-21 mesage" : (age >= 21 && age < 24) ? "21-24 message" : "24+ message";

		System.out.printf("Age: %d\nMessage: %s", age, message);

	}

}
