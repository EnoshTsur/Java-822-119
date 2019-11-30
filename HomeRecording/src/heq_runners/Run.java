package heq_runners;

import heq_objects.Person;

public class Run {

	public static void main(String[] args) {
		Person p = new Person("Avner", 74);
		Person p2 = new Person("Avner", 40);
		
		System.out.println(p.equals(p2));
	}

}
