package entities;

public class Horse extends Animal{

	public Horse(String name, int age) {
		super(name, age);
	}

	@Override
	public void speak() {
		System.out.println("Iee ahh!!");		
	}

}
