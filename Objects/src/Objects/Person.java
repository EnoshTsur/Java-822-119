package Objects;

public class Person {

	public String name;
	public int age;
	public Address address;
	
	public Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return String.format("Person: [name: %s, age: %d, address: %s]", name, age, address);
	}
	
	

}

