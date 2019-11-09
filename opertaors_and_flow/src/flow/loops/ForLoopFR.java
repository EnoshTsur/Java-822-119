package flow.loops;

public class ForLoopFR {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
			
		}

		for (int i = 0; i < 10; i++) {
			if (i == 8) {
				break;
			}
			System.out.println(i);

		}
		
		
		for (int i = 0; i < 10; i++) {
			
			for (int j = 0; j < 10; j++) {
				System.out.printf("I: %d, J: %d\n", i, j);
			}
		}
	}

}
