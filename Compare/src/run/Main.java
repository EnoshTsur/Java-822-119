package run;

import java.util.Arrays;

import entities.Person;

public class Main {

	public static void main(String[] args) {

		Person[] persons = {
				
				new Person(67, "Zvi"),
				new Person(24, "Avi"),
				new Person(43, "Gabe"),
				new Person(1, "Benny")
		};
		
		Arrays.sort(persons);
		System.out.println(Arrays.toString(persons));
	}

}
