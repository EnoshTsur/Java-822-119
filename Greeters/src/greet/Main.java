package greet;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		GreetSystem greetSystem = new GreetSystem();
		Thread thread = greetSystem.getGreetThread();
		thread.start();
		
		String action = "";
		Scanner input = new Scanner(System.in);
		
		while(!action.equalsIgnoreCase("exit")) {
			System.out.println("Pick an action");
			action = input.nextLine();
			
			if(action.equalsIgnoreCase("add")) {
				System.out.println("Enter year");
				int year = input.nextInt();
				System.out.println("Enter month");
				int month = input.nextInt();
				System.out.println("Enter day");
				int day = input.nextInt();
				System.out.println("Enter hour");
				int hour = input.nextInt();
				System.out.println("Enter minute");
				int minute = input.nextInt();
				input.nextLine();
				System.out.println("Enter Message");
				String message = input.nextLine();
				Greeter greeter = new Greeter(LocalDateTime.of(year, month, day, hour, minute), message);
				greetSystem.addGreet(greeter);
				
			}
			
			if (action.equalsIgnoreCase("get")) {
				for (Greeter greet : greetSystem.getGreeters()) {
					System.out.println(greet);
				}
			}
		}

		thread.interrupt();
	}

}
