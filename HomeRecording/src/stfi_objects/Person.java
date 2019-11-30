package stfi_objects;

public class Person {
	
	private String name;
	private int age;
	public static String type;
	
	static {
		type = "Person";
	}
	
	{
		name = "Avner";
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	

}
