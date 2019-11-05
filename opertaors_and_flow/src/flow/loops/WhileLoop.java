package flow.loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		
		/***
		 *  WHILE
		 * 	LOOP
		 *  WITH 'INDEX'
		 */
//		 Initial counter
		int counter = 0;
		
		// loop while counter is less than 10
		while(counter < 10) {
			System.out.println(counter);
			
			// increment counter
			counter++;
		}
		
		
		/**
		 * WHILE
		 * LOOP
		 * WITH BOOLEAN & INPUT
		 */
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		boolean quit = true;

		String name = "";
		
		while(running) {
			System.out.println("Hello friend, please enter your name");
			name = scanner.nextLine();
			if(!name.isEmpty()) {
				running = false;
			}
		}
		
		System.out.printf("Hello %s!\n", name);
		
		
		/***
		 * DO WHILE
		 * RUNNING SCOPE AND AFTER CHECK FOR CONDITION
		 */
		boolean running2 = false;
		
		do {
			
			System.out.println("hi");
			
		}while(running2);
		

		
		/***
		 * NESTED WHILE
		 */
		int counter2 = 0;
		
		while(counter2 < 10) {
			int secondCounter = 0;
			
			while(secondCounter < 10) {
				
				System.out.printf(
						"Counter: %d\nSecond Counter: %d\n", 
						counter2, 
						secondCounter
				);
				secondCounter++;
			}
			counter2++;
			
		}
		
		

	}

}
