package Runners;

import Objects.Person;

public class Runner {

	public static void main(String[] args) {

		Person person = new Person("Itay");
		
		System.out.printf(
				"Person's name: %s\nPerson's age: %d",
				person.name,
				person.age
		);
		
	}
	


}
