package opertaors_and_flow;

public class LogicOperators {

	public static void main(String[] args) {

////		System.out.printf("3 < 5: %b \n", 3 < 5);
////		System.out.printf("2 < 4: %b \n", (2 < 4));
////
////		boolean isGreater = 6 < 2;
////		System.out.printf("6 < 2: %b \n", isGreater);
//
////		System.out.printf("2 <= 2: %b \n", 2 <= 2);
////		System.out.printf("2 >= 2: %b \n", 2 >= 2);

//		boolean isSomething = true;
//		System.out.println(!isSomething);
//
//		System.out.printf("3 == 3: %b", 3 == 3);
//		System.out.printf("3 != 3: %b", 3 != 3);

		System.out.printf("(3 > 1) && (1 < 3): %b \n", (3 > 1) && (1 < -9));
		System.out.printf("(3 < 1) || (1 < 3): %b \n", (3 < 1) || (1 < 3));
		System.out.printf("((3 < 1) || (1 < 3)) && 1 > 4: %b \n", ((3 < 1) || (1 < 3)) && 1 > 4);

	}

}
