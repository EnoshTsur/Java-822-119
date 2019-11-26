package runners;

import objects.Person;

public class PersonRunner {

	public static void main(String[] args) {
		Person p = new Person(-23);
		System.out.println(p.getAge());
		p.setAge(400);
		System.out.println(p.getAge());

	}

}
