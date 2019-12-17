package entities;

public abstract class Animal {
	
	protected String name;
	protected int age;
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public abstract void speak();

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
	
}
