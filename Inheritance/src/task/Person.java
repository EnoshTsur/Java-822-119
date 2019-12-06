package task;

public class Person {

	protected String name;
	protected int id;
	protected int age;

	public Person(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	protected void printBasic() {
		System.out.printf(
				"Name: %s, ID: %d, Age: %d\n",
				name, id, age
		);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
