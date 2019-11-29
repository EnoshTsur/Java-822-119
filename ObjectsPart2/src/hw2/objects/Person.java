package hw2.objects;

public class Person {
	
	// Attributes
	private String name;
	private int age;
	private Address address;
	
	/***
	 * CTR - All Arguments 
	 * @param name
	 * @param age
	 * @param address
	 */
	public Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	
	public String greet(Person person) {
		return String.format(
				"Hi I'm %s and I'm %d years old\n" +
				"Nice to meet you %s\n" + 
				"your address is %s\n" +
				"%s is bigger",
				name, age,
				person.getName(), person.getAddress(),
				(person.getAge() > age) ? person.getName() : name
				);
	}

	
	// Getters & Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// To String
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	

}
