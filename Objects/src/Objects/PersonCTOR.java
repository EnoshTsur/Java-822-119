package Objects;

public class PersonCTOR {
	
	public String name;
	public int age;
	public String address;

	public PersonCTOR(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public PersonCTOR(String name, int age) {
		this(name, age, "Tel Aviv 3");
	}
	
	public PersonCTOR(int age) {
		this("Yaniv", age);
	}
	
	public PersonCTOR() {
		this(13);
	}

	
	@Override
	public String toString() {
		return "PersonCTOR [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	

}
