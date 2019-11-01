package flow;

public class IfStatement2 {

	public static void main(String[] args) {
		int random = (int) (Math.random() * 10) + 1;

		if (random < 5) {
			System.out.printf("%d is less than 5", random);
		}

		else {
			System.out.printf("%d is greater than 5", random);
		}
	}

}
