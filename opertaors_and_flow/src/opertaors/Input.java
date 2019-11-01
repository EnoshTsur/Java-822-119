package opertaors;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your name:");
		String name = input.nextLine();

		// TODO:// Get his age! (as int)
		System.out.println("Enter your age:");
		int age = input.nextInt();

		// TODO:// Get isCool (as boolean)
		System.out.println("Is cool?");
		boolean isCool = input.nextBoolean();

		// %s = string , %d = digit (number), %b = boolean
		System.out.printf("Hi %s and your age is %d and is cool? :%b", name, age, isCool);

		input.close();

	}

}
