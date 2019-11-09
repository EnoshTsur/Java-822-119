package flow.loops;

import java.util.Scanner;

public class WhileLoopFR {

	public static void main(String[] args) {
		
		int min = 0;
		int max = 10;
		
		while (min < max) {
			System.out.println(max);
			max--;
		}
		
		System.out.printf("min: %d, max: %d\n", min, max);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = input.nextLine();
		
		int wrongCounter = 0;
		
		while(name.trim().isEmpty())  {
			System.err.println("Please enter a valid name!");
			name = input.nextLine();
			wrongCounter++;
		}
		
		System.out.printf(
				"%s %s", 
				(wrongCounter > 0 ? "finally you did it " : "first try amazing "), 
				name
		);
		
		
		do {
			System.out.println("hi");
		} while(false);
		
		
		
		int min2 = 0;
		int max2 = 10;
		
		while (min2 < max2) {
			
			if(min2 % 2 != 0) {
				min2++;
				continue;
			}
			
			System.out.println(min2);
			min2++;
		}
		
		int min3 = 0;
		int max3 = 10;
		
		while (min3 < max3) {
			if (min3 == 6) {
				break;
			}
			System.out.println(min3);
			min3++;
		}
		
		
		int min4 = 1;
		int max4 = 10;
		
		Scanner input2 = new Scanner(System.in);
		
		while (min4 < max4) {
			
			System.out.println("Please enter your name");
			String name2 = input2.nextLine();
			
			while(name2.trim().isEmpty()) {
				System.err.println("Please enter a valid name!");
				name2 = input2.nextLine();
			}
			
			System.out.printf("Welcome %s you are at position %d\n", name2, min4);
			
			min4++;
		}
		
		
		
	}

}
