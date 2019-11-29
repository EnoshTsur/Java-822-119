package hw2.runners;

import hw2.objects.Address;
import hw2.objects.Person;

public class Run {

	public static void main(String[] args) {
		Person p = new Person("Avner", 34, new Address("Ashdod", "herzel", 2));
		Person p2 = new Person("Itay", 24, new Address("Rehovot", "rambam", 2));
		
		System.out.println(p.greet(p2));
	}
}
